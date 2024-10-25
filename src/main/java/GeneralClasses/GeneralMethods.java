package GeneralClasses;

import java.util.Scanner;

public class GeneralMethods {

    public static String userInput(String message) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println(message);
        String answer = reader.nextLine();

        return answer;
    }
}
