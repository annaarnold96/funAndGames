package higherOrLower;

import GeneralClasses.GameLoader;
import picocli.CommandLine;

@CommandLine.Command(name="gameLoader")
public class HigherOrLowerLoader extends GameLoader {
    public HigherOrLowerLoader() {
        super(new HigherOrLowerInterface());
    }
}
