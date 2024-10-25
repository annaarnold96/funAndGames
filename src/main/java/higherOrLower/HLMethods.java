package higherOrLower;

import java.util.Scanner;

public class HLMethods {

    public String userInput() {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Higher or lower? H/L: ");
        String answer = reader.nextLine();

        return answer;
    }

    public void printCardDrawn(String cardValue, String suit){
        System.out.println("Card drawn is: " + cardValue + " " + suit);
    }

    public void userChoice(String input){
        String hOrL = (input.equalsIgnoreCase("l")) ? "You chose lower" : "You chose higher";
        System.out.println(hOrL);
    }


}
