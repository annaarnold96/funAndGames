package demo;

import demo.commands.BlackJackCommands;
import demo.commands.HeartsCommands;
import picocli.CommandLine;

@CommandLine.Command(name = "demo", subcommands = {HeartsCommands.class, BlackJackCommands.class})
public class Demo {

    public static void main(String[] args) {
        CommandLine cli = new CommandLine(Demo.class);
        int exitCode = cli.execute(args);
        System.exit(exitCode);
    }
}
