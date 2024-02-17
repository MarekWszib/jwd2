package laboratoria.lab15.zadanie1;

public class MusicPlayerTester {
    public static void main(String[] args) {
        Player mp3MusicPlayer = new Mp3MusicPlayer("Mp3 music player");
        MusicPlayer cdMusicPlayer = new CDMusicPlayer("CD music player");
        StreamingPlayer streamingPlayer = new StreamingPlayer("Streaming player");

        Player[] players = {mp3MusicPlayer,cdMusicPlayer, streamingPlayer};

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
