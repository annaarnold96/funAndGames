// ----------- REFACTOR SO IT CAN CALL GAMES TO RUN -----------



import Controllers.CardGamesController;
import picocli.CommandLine;


@CommandLine.Command(name = "funAndGames", subcommands = {CardGamesController.class})
public class FunAndGames {

  public static void main(String[] args) {

    CommandLine cli = new CommandLine(new FunAndGames());
    int exitCode = cli.execute(args);
    System.exit(exitCode);
  }
}
