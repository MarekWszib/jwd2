package laboratoria.lab22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

//  Zakładając, że klasa Transaction posiada właściwości category (String) oraz value (double).
//  Napisz program, który przyjmie listę obiektów klasy Transaction i wykona następujące operacje przy użyciu strumieni:
//  - pogrupuje transakcje według kategorii,
//  - uzyska sumę wartości transakcji dla każdej kategorii,
//  - posortuje kategorie według sumy transakcji w kolejności malejącej.

public class TransactionOperations {
    public static void main(String[] args) {
        List<Transaction> transactions = provideTransactions();

        Map<String, Double> valuesByCategories = transactions.stream()
                .collect(groupingBy(Transaction::getCategory))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream()
                                .map(Transaction::getValue)
                                .reduce(0d, Double::sum)
                ));

//todo

        System.out.println(valuesByCategories);
    }

    private static List<Transaction> provideTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("cat_A", 100d));
        transactions.add(new Transaction("cat_B", 200d));
        transactions.add(new Transaction("cat_B", 300d));
        transactions.add(new Transaction("cat_C", 400d));
        transactions.add(new Transaction("cat_A", 500d));
        transactions.add(new Transaction("cat_C", 600d));
        transactions.add(new Transaction("cat_B", 700d));
        transactions.add(new Transaction("cat_D", 800d));
        return transactions;
    }
}

class Transaction {
    private String category;
    private double value;

    public Transaction(String category, double value) {
        this.category = category;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public double getValue() {
        return value;
    }

}
