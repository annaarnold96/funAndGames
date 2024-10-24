package demo.commands;

import demo.games.Game;

public abstract class GameLoader implements Runnable {

    private Game game;

    public GameLoader(Game game) {
        this.game = game;
    }

    @Override
    public void run() {

        game.setup();

        while (game.isGameRunning()) {
            game.play();
        }

    }
}
