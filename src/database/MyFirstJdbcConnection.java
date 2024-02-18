package database;

import java.sql.*;

public class MyFirstJdbcConnection {
    // 10 nazwisk z tabeli Contact bazy AdventureWorks
    //SELECT TOP 10 * FROM Person.Contact
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;trustServerCertificate=true;databaseName=AdventureWorks;user=pedrys;password=";
        String sql = "SELECT TOP 10 * FROM Person.Contact";

        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + rs.getString("LastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
