package higherOrLower;


// import kong.unirest.Unirest;

// import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.Unirest;

import java.util.*;


@JsonIgnoreProperties(ignoreUnknown = true)
record Deck() {
}

public class deckApi {

    public static void main(String[] args) throws Exception {



        boolean winning = true;
        // Create the deck
        JsonNode deck = CardDeck.getADeck(1);
        String deckId = String.valueOf(deck.get("deck_id"));
        String shortDeckId = deckId.replace("\"", "");
        Card cardDrawn = CardDeck.drawCards(1, shortDeckId);

        // ------------ DEBUGGING -------------
        //System.out.println(cardDrawn);

        // Show the card
        String cardValue = cardDrawn.getValue().replace("\"", "");
        System.out.println("Card drawn is: " + cardValue + " " + cardDrawn.getSuit().replace("\"", ""));

        int intCardValue = cardDrawn.setFaceCards(cardValue);

        // Repeat until lost
        while (winning == true) {

            // User input
            Scanner reader = new Scanner(System.in); // Reading from System.in
            System.out.println("Higher or lower? H/L: ");
            String answer = reader.nextLine();

            String hOrL = (answer.toLowerCase().equals("l")) ? "You chose lower" : "You chose higher";
            System.out.println(hOrL);

            int lastCardValue = intCardValue;

            // Draw next card
            cardDrawn = CardDeck.drawCards(1, shortDeckId);
            cardValue = cardDrawn.getValue().replace("\"", "");
           System.out.println("Card drawn is: " + cardValue + " " + cardDrawn.getSuit().replace("\"", ""));

           intCardValue = cardDrawn.setFaceCards(cardValue);
           

            if ((intCardValue < lastCardValue && answer.equals("l") || (intCardValue > lastCardValue && answer.equals("h")))) {
                System.out.println("You are correct!");

            } else {
                System.out.println("You were wrong. Game over.");
                winning = false;
            }


        }
    }
}
