package APIs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import GeneralClasses.Card;
import GeneralClasses.Deck;
import kong.unirest.Unirest;

public class CardDeckAPIs {

    public static Deck getADeck(int deckCount) throws Exception {

        String url = "https://www.deckofcardsapi.com/api/deck/new/shuffle/?deck_count=" + deckCount;

        var response = Unirest.get(url).header("Accept", "application.json").asString();

        String deck = response.getBody();
        ObjectMapper mapper = new ObjectMapper();

        JsonNode deckTree = mapper.readTree(deck);

        String deckId = String.valueOf(deckTree.get("deck_id"));
        String remaining = String.valueOf(deckTree.get("remaining"));
        String shuffled = String.valueOf(deckTree.get("shuffled"));


        return new Deck(deckId,remaining,shuffled);
    }


    public static Card drawCards(int numberOfCards, String deckID) throws Exception {

        String url = "https://www.deckofcardsapi.com/api/deck/" + deckID + "/draw/?count=" + numberOfCards;

        var response = Unirest.get(url).header("Accept", "application.json").asString();

        String card = response.getBody();
        ObjectMapper mapper = new ObjectMapper();

        var tree = mapper.readTree(card);

        JsonNode cardDetails = tree.get("cards").get(0);

        String code = String.valueOf(cardDetails.get("code"));
        String image = String.valueOf(cardDetails.get("image"));
        String value = String.valueOf(cardDetails.get("value"));
        String suit = String.valueOf(cardDetails.get("suit"));


        return new Card(code,image,value,suit);
    }

}
