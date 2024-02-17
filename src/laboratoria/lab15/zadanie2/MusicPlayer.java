package laboratoria.lab15.zadanie2;

abstract public class MusicPlayer implements Player {
    public String playerType;
    private Song[] songs;
    private int currentSongIndex = 0;

    public MusicPlayer(String playerType, Song[] songs) {
        this.playerType = playerType;
        this.songs = songs;
    }

    public Song getCurrentSong() {
        return songs[currentSongIndex];
    }

    @Override
    public void play() {
        System.out.println(playerType + " odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println(playerType + " pause " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println(playerType + " stop " + getCurrentSong());
    }

    @Override
    public void next() {
        System.out.println(playerType + " next ");
        if (++currentSongIndex >= songs.length) {
            currentSongIndex = 0;
        }
        play();
    }

    @Override
    public void previous() {
        System.out.println(playerType + " previous ");
        if (--currentSongIndex < 0) {
            currentSongIndex = songs.length - 1;
        }
        play();
    }
}
