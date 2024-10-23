package demo.games;

public class Hearts implements Game {

    private boolean gameRunning = true;

    @Override
    public boolean isGameRunning() {
        return gameRunning;
    }

    @Override
    public void setup() {
        System.out.println("Setting up...");
    }

    @Override
    public void play() {
        System.out.println("Playing Hearts");
        gameRunning = false;
        System.out.println("Its over Hearts");
    }
}
