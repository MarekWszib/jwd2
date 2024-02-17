package laboratoria.lab15.zadanie2;

public class MusicPlayerTester {
    public static void main(String[] args) {
        Song[] songs = new Song[3];
        songs[0] = new Song("Michael Jackson", "Beat It", "Thriller");
        songs[1] = new Song("Pearl Jam", "Even Flow", "Ten");
        songs[2] = new Song("Portishead", "Over", "NYC Live");

        Player mp3MusicPlayer = new Mp3Player("Mp3 music player", songs);
        MusicPlayer cdMusicPlayer = new CDPlayer("CD music player", songs);
        StreamingPlayer streamingPlayer = new StreamingPlayer("Streaming player", songs);

        Player[] players = {mp3MusicPlayer, cdMusicPlayer, streamingPlayer};

        players[0].play();
        players[0].stop();
        players[0].next();

        System.out.println();

        players[1].play();
        players[1].play();
        players[1].next();
        players[1].stop();
        players[1].previous();

        System.out.println();

        players[2].play();
        players[2].pause();
    }
}
