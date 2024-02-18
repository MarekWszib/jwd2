package wczytywaniePlikuTxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> lines;

        try {
            lines = Files.readAllLines(Paths.get("src/data.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(lines);
    }
}
