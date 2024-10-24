package demo.commands;


import demo.games.Hearts;
import picocli.CommandLine;

@CommandLine.Command(name="hearts")
public class HeartsCommands extends GameLoader {
    public HeartsCommands() {
        super(new Hearts());
    }
}
