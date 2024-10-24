import Controllers.CardGamesController;
import GeneralClasses.GameLoader;
import higherOrLower.HigherOrLowerLoader;
import picocli.CommandLine;


@CommandLine.Command(name = "funAndGames", subcommands = {HigherOrLowerLoader.class})
public class FunAndGames {

  public static void main(String[] args) {

    CommandLine cli = new CommandLine(new FunAndGames());
    int exitCode = cli.execute(args);
    System.exit(exitCode);
  }
}
