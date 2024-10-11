package higherOrLower;

import java.util.Scanner;

public class HLMethods {

    public String userInput() {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Higher or lower? H/L: ");
        String answer = reader.nextLine();

        return answer;
    }

    public boolean endGameCheck(int intCardValue, int lastCardValue, String userInput) {
        if ((intCardValue < lastCardValue && userInput.equalsIgnoreCase("l") || (intCardValue > lastCardValue && userInput.equalsIgnoreCase("h")))) {
            System.out.println("You are correct!");
            return true;

        } else {
            System.out.println("You were wrong. Game over.");
            return false;
        }
    }

    public void printCardDrawn(String cardValue, String suit){
        System.out.println("Card drawn is: " + cardValue + " " + suit);
    }

    public void userChoice(String input){
        String hOrL = (input.equalsIgnoreCase("l")) ? "You chose lower" : "You chose higher";
        System.out.println(hOrL);
    }


}
