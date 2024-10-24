package GeneralClasses;

import Interfaces.Game;
import higherOrLower.HigherOrLower;
import picocli.CommandLine;

public abstract class GameLoader implements Runnable {

    private Game game;

    public GameLoader(Game game) {
        this.game = game;
    }

    @Override
    public void run() {

        try {
            game.setup();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        while (game.isGameRunning()) {
            try {
                game.play();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
