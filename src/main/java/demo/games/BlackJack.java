package demo.games;


public class BlackJack implements Game {

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
        System.out.println("Playing BlackJack");
        int count = 0;

        while (count < 3) {
            System.out.println("Playing BlackJack");
            System.out.println("Round - " + (count + 1));
            count++;
        }

        gameRunning = false;
    }
}
