package APIs;

import GeneralClasses.Character;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.Unirest;

public class DisneyAPIs {

    public static Character getACharacter(int id) throws Exception{
        String url = "https://api.disneyapi.dev/character/" + id;

        var response = Unirest.get(url).header("Accept", "application.json").asString();

        String character = response.getBody();
        ObjectMapper mapper = new ObjectMapper();

        JsonNode characterTree = mapper.readTree(character);

        var data = characterTree.get("data");
        String film = String.valueOf(data.get("films").get(0));
        String name = String.valueOf(data.get("name"));
        String img = String.valueOf(data.get("imageUrl"));

        return new Character(id,film,name,img);

    }

    public static void main(String[] args) throws Exception {

        System.out.println(DisneyAPIs.getACharacter(308).getImg());
    }
}
