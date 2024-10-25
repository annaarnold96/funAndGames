package higherOrLower;

import java.util.Scanner;

public class HLMethods {

    public void userChoice(String input){
        String hOrL = (input.equalsIgnoreCase("l")) ? "You chose lower" : "You chose higher";
        System.out.println(hOrL);
    }


}
