package higherOrLower;

import APIs.CardDeckAPIs;
import GeneralClasses.Card;
import GeneralClasses.Deck;
import Interfaces.Game;

//@CommandLine.Command(name="higherOrLower")
public class HigherOrLower implements Game {
    boolean winning;
    Deck deck;
    String deckId;
    Card cardDrawn;
    String cardValue;
    int intCardValue;
    HLMethods methods;
    int lastCardValue;
    String userInput;

    @Override
    public boolean isGameRunning() {
        if (userInput == null) {
            return true;
        }else{

            if ((intCardValue < lastCardValue && userInput.equalsIgnoreCase("l") || (intCardValue > lastCardValue && userInput.equalsIgnoreCase("h")))) {
                System.out.println("You are correct!");
                return true;

            } else {
                System.out.println("You were wrong. Game over.");
                return false;
            }
        }
    }

    @Override
    public void setup() throws Exception {
        winning = true;
        methods = new HLMethods();
            // Create the deck
            deck = CardDeckAPIs.getADeck(1);
            deckId = deck.getDeckId();

            // Draw the card
            cardDrawn = CardDeckAPIs.drawCards(1, deckId);

            // ------------ DEBUGGING -------------
            // System.out.println(cardDrawn);
            // System.out.println(deck);
            // ------------------------------------

            // Get card value & show the card
            cardValue = cardDrawn.getValue();
            methods.printCardDrawn(cardValue, cardDrawn.getSuit());

            intCardValue = cardDrawn.setFaceCards(cardValue);

    }

    @Override
    public void play() throws Exception {
        // Repeat until lost

            // User input
            userInput = methods.userInput();
            methods.userChoice(userInput);

            lastCardValue = intCardValue;

            // Draw next card
            cardDrawn = CardDeckAPIs.drawCards(1, deckId);

            // Get card value & show the card
            cardValue = cardDrawn.getValue();
            methods.printCardDrawn(cardValue, cardDrawn.getSuit());

            // Set int for face cards
            intCardValue = cardDrawn.setFaceCards(cardValue);

    }

}
