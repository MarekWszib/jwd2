package laboratoria.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//   Mając do dyspozycji plik tekstowy z angielską wersją książki
//   “Przygody Alicji w Krainie Czarów” alice30.txt wyznacz:
//   - liczbę różnych wyrazów użytych w książce (pomiń znaki interpunkcyjne oraz cyfry),
//   - literę na jaką zaczyna się najwięcej (różnych) wyrazów.

public class Alice {
    private static final String FILE_PATH = "src/laboratoria/lab18/alice30.txt";

    public static void main(String[] args) {
        List<String> allLines = loadTextFile(FILE_PATH);
//        System.out.println(allLines);

        if (allLines != null) {
            Set<String> words = divideIntoWordsAndClean(allLines);
            System.out.println(words);
        }

    }

    private static Set<String> divideIntoWordsAndClean(List<String> allLines) {
        Set<String> words = new TreeSet<>();

        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }

        return words;
    }


    private static List<String> loadTextFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Błąd w trakcie odczytu pliku: " + e.getMessage());
        }
        return null;
    }

    private static String cleanWord(String word) {
        return word.replaceAll("\\p{Punct}|\\d","");
    }

}
