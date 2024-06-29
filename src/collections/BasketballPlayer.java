package collections;

public class BasketballPlayer {
    private String name;
    private String team;
    private int games;
    private int points;

    public BasketballPlayer(String name, String team, int games, int points) {
        this.name = name;
        this.team = team;
        this.games = games;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", games=" + games +
                ", points=" + points +
                '}';
    }
}
