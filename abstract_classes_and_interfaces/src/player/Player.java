package player;

public class Player implements Playing, Recording{


    @Override
    public void play() {
        System.out.println("Playing");

    }

    @Override
    public void record() {
        System.out.println("Recording");

    }

    @Override
    public void pause() {
        System.out.println("Pause");

    }

    @Override
    public void stop() {
        System.out.println("Stop");

    }
}
