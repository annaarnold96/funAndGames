package Controllers;

//import higherOrLower.HigherOrLower;
import higherOrLower.HigherOrLower;
import higherOrLower.HigherOrLowerLoader;
import picocli.CommandLine;

@CommandLine.Command(name = "cardGames", subcommands = {HigherOrLowerLoader.class})

public class CardGamesController implements Runnable {

        @Override
        public void run() {
            System.out.println("Card games to play");
            System.out.println("higherOrLower: Higher or Lower game");
        }
    }

