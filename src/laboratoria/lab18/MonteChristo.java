package laboratoria.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//        Mając do dyspozycji plik z książką w formacie tekstowym crsto10.txt wykonaj poniższe polecenia:
//        wczytaj do listy wszystkie wiersze książki “Hrabia Monte Christo”,
//        wyznacz liczbę wszystkich wierszy, tworząc metodę, która przyjmuje obiekty typu List i zwraca liczbę typu int (liczba elementów listy),
//        napisz metodę, która wyświetli na ekranie co setny wiersz książki,
//        napisz metodę, która znajdzie i wyświetli najdłuższy wers z książki wielkimi literami.

public class MonteChristo {
    public static void main(String[] args) {
        List<String> lines = loadLines("src/crsto10.txt");
//        System.out.println(lines);

        if (lines != null && !lines.isEmpty()) {
            System.out.println("Number of lines: " + countLines(lines));
            printEveryHundredthLine(lines);
            printTheLongestLine(lines);
        }
    }

    private static List<String> loadLines(String textFileName) {
        List<String> allLines = new ArrayList<>();
        try {
            allLines = Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Failed to load file " + textFileName);
            System.exit(-1);
        }
        return allLines;
    }

    private static int countLines(List<String> lines) {
        return lines.size();
    }

    private static void printEveryHundredthLine(List<String> lines) {
        int size = lines.size();
        for (int i = 99; i < size; i = i + 100) {
            System.out.println((i + 1) + " line: " + lines.get(i));
        }
    }

    private static void printTheLongestLine(List<String> lines) {
        int longestLineLength = 0;
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLineLength) {
                longestLineLength = line.length();
                longestLine = line;
            }
        }
        System.out.println("The longest (" + longestLineLength + " signs) line in UPPER CASE:\n" + longestLine.toUpperCase());
    }

}
