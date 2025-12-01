interface MusicPlayer {
    void play();
    void pause();
}

class Spotify implements MusicPlayer {
    public void play() {
        System.out.println("Playing song...");
    }

    public void pause() {
        System.out.println("Song paused.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MusicPlayer m = new Spotify();
        m.play();
        m.pause();
    }
}
