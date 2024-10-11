package higherOrLower;

import APIs.CardDeckAPIs;
import GeneralClasses.Card;
import GeneralClasses.Deck;
import picocli.CommandLine;

@CommandLine.Command(name="higherOrLower")
public class HigherOrLower implements Runnable {

    public void run() {

        boolean winning = true;
        HLMethods methods = new HLMethods();
        try {
            // Create the deck
            Deck deck = CardDeckAPIs.getADeck(1);
            String deckId = deck.getDeckId();

            // Draw the card
            Card cardDrawn = CardDeckAPIs.drawCards(1, deckId);

            // ------------ DEBUGGING -------------
            // System.out.println(cardDrawn);
            // System.out.println(deck);
            // ------------------------------------

            // Get card value & show the card
            String cardValue = cardDrawn.getValue();
            methods.printCardDrawn(cardValue, cardDrawn.getSuit());

            int intCardValue = cardDrawn.setFaceCards(cardValue);

            // Repeat until lost
            while (winning == true) {

                // User input
                String userInput = methods.userInput();
                methods.userChoice(userInput);

                int lastCardValue = intCardValue;

                // Draw next card
                cardDrawn = CardDeckAPIs.drawCards(1, deckId);

                // Get card value & show the card
                cardValue = cardDrawn.getValue();
                methods.printCardDrawn(cardValue, cardDrawn.getSuit());

                // Set int for face cards
                intCardValue = cardDrawn.setFaceCards(cardValue);

                // Check end game criteria
                winning = methods.endGameCheck(intCardValue, lastCardValue, userInput);

            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
