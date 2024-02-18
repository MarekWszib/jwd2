package database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "pedrys";
    private static final String DB_PASS = "";
    private static final String DB_NAME = "pedrys";
    private static final String INSERT_ENTRY_SQL =
            "INSERT INTO budget.BudgetEntries (EntryName, Amount) values (?,?)";

    private static final String GET_BALANCE_SQL = "select sum(Amount) as Balance from budget.BudgetEntries";

    public static void main(String[] args) {

        //TODO: potrzebna walidacja
        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));

        HomeBudget homeBudget = new HomeBudget();

        try (Connection con = homeBudget.connect(DB_USER, DB_PASS, DB_NAME); Statement stmt = con.createStatement()) {

            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2, budgetEntry.getAmount());
            ps.execute();

            BigDecimal balance;
            ResultSet rs = stmt.executeQuery(GET_BALANCE_SQL);

            if (rs.next()) {
                balance = rs.getBigDecimal("Balance");
            } else {
                balance = BigDecimal.ZERO;
            }

            System.out.print("Zapisano! Kwota: " + currencyFormat(budgetEntry.getAmount()));
            System.out.print(", nazwa: " + budgetEntry.getEntryName());
            System.out.print(", saldo: " + currencyFormat(balance));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Connection connect(String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(DB_HOST);
        ds.setDatabaseName(dbName);
        ds.setUser(username);
        ds.setPassword(password);
        ds.setPortNumber(DB_PORT);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
