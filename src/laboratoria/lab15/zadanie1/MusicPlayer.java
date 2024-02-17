package laboratoria.lab15.zadanie1;

abstract public class MusicPlayer implements Player {
    String playerType;

    @Override
    public void play() {
        System.out.println(playerType + " odtwarza muzykę");
    }

    @Override
    public void pause() {
        System.out.println(playerType + " pause");
    }

    @Override
    public void stop() {
        System.out.println(playerType + " stop");
    }

    @Override
    public void next() {
        System.out.println(playerType + " next");
    }

    @Override
    public void previous() {
        System.out.println(playerType + " previous");
    }
}
