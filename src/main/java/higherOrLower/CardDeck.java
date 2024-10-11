package higherOrLower;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.Unirest;

import java.util.List;

public class CardDeck {

    public static JsonNode getADeck(int deckCount) throws Exception {

        String url = "https://www.deckofcardsapi.com/api/deck/new/shuffle/?deck_count=" + deckCount;

        var response = Unirest.get(url).header("Accept", "application.json").asString();

        String deck = response.getBody();
        ObjectMapper mapper = new ObjectMapper();


        return mapper.readTree(deck);
    }

//    public static JsonNode drawCards(int numberOfCards, String deckID) throws Exception {
//
//        String url = "https://www.deckofcardsapi.com/api/deck/" + deckID + "/draw/?count=" + numberOfCards;
//
//        var response = Unirest.get(url).header("Accept", "application.json").asString();
//
//        String card = response.getBody();
//        ObjectMapper mapper = new ObjectMapper();
//
//        var tree = mapper.readTree(card);
//
//
//
//        return tree;
//    }

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


        Card testCard = new Card(code,image,value,suit);
        return testCard;
    }

}
