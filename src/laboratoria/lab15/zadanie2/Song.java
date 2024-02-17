package laboratoria.lab15.zadanie2;

public class Song {
    private String artist;
    private String title;
    private String album;

    public Song(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    //getery i setery na dobrą sprawę zbędne
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
