package guessTheDisneyFilm;

import APIs.DisneyAPIs;
import GeneralClasses.Character;
import Interfaces.Game;

public class GuessDisneyFilm implements Game {
    private Character character;

    @Override
    public boolean isGameRunning() {
        return false;
    }

    @Override
    public void setup() throws Exception {
        character = DisneyAPIs.getACharacter()

    }

    @Override
    public void play() throws Exception {
        System.out.println(DisneyAPIs.getACharacter(308).getImg());

    }
}
