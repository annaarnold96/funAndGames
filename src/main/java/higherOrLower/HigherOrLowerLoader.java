package higherOrLower;

import GeneralClasses.GameLoader;
import picocli.CommandLine;

@CommandLine.Command(name="higherOrLower")
public class HigherOrLowerLoader extends GameLoader {
    public HigherOrLowerLoader() {
        super(new HigherOrLower());
    }
}
