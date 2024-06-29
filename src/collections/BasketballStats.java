package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketballStats {
    public static void main(String[] args) {
        String filePath = "src/collections/players.csv";

        List<BasketballPlayer> players = loadPlayersFromCSV(filePath);
        System.out.println(players);
        System.out.println();

        BasketballPlayer bestPlayer = findHighestAveragePointsPlayer(players);
        System.out.println(bestPlayer);
        System.out.println();

        Map<String, Integer> teamPlayerCount = countPlayersByTeam(players);
        System.out.println(teamPlayerCount);
        System.out.println();

        Map<String, Integer> bestTeamAndPoints = findBestTeam(players);
        System.out.println(bestTeamAndPoints);
        System.out.println();

        System.out.println("Zawodnik z największą liczbą punktów: " + bestPlayer);
        System.out.println("Liczba zawodników w każdej z drużyn: " + teamPlayerCount);
        System.out.println("Drużyna z największą sumaryczną liczbą punktów: " + bestTeamAndPoints);
    }

    private static Map<String, Integer> findBestTeam(List<BasketballPlayer> players) {
        Map<String, Integer> teamPoints = new HashMap<>();
        for (BasketballPlayer player : players) {
            teamPoints.put(player.getTeam(), teamPoints.getOrDefault(player.getTeam(), 0) + player.getPoints());
        }
        String bestTeam = null;
        int highestPoints = 0;

        for (Map.Entry<String, Integer> entry : teamPoints.entrySet()) {
            if (entry.getValue() > highestPoints) {
                highestPoints = entry.getValue();
                bestTeam = entry.getKey();
            }
        }

        Map<String, Integer> bestTeamAndPoints = new HashMap<>();
        bestTeamAndPoints.put(bestTeam, highestPoints);

        return bestTeamAndPoints;
    }

    private static Map<String, Integer> countPlayersByTeam(List<BasketballPlayer> players) {
        Map<String, Integer> teamPlayerCount = new HashMap<>();
        for (BasketballPlayer player : players) {
            teamPlayerCount.put(player.getTeam(), teamPlayerCount.getOrDefault(player.getTeam(), 0) + 1);
        }


        return teamPlayerCount;
    }

    private static BasketballPlayer findHighestAveragePointsPlayer(List<BasketballPlayer> players) {
        BasketballPlayer highestAveragePointsPlayer = players.get(0);

        for (BasketballPlayer player : players) {
            if (player.getPoints() / player.getGames() > highestAveragePointsPlayer.getPoints() / highestAveragePointsPlayer.getGames()) {
                highestAveragePointsPlayer = player;
            }
        }

        return highestAveragePointsPlayer;
    }

    private static List<BasketballPlayer> loadPlayersFromCSV(String filePath) {
        List<BasketballPlayer> players = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] fields = line.split(",");
                String name = fields[0];
                String team = fields[1];
                int games = Integer.parseInt(fields[2]);
                int points = Integer.parseInt(fields[3]);
                BasketballPlayer newPlayer = new BasketballPlayer(name, team, games, points);
                players.add(newPlayer);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania pliku csv: " + e.getMessage());
        }

        return players;
    }
}
