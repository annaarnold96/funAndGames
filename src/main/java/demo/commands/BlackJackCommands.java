package demo.commands;

import demo.games.BlackJack;
import picocli.CommandLine;

@CommandLine.Command(name = "blackjack")
public class BlackJackCommands extends GameLoader {
    public BlackJackCommands() {
        super(new BlackJack());
    }
}
