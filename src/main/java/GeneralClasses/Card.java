package GeneralClasses;

public class Card {

    private String code;
    private String image;
    private String value;
    private String suit;

    public Card(String code, String image, String value, String suit) {
        this.code = code;
        this.image = image;
        this.value = value;
        this.suit = suit;
    }

    public String getCode() {
        return code.replace("\"", "");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image.replace("\"", "");
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getValue() {
        return value.replace("\"", "");
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit.replace("\"", "");
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int setFaceCards(String cardValue){
        return switch (cardValue) {
            case "ACE" -> 1;
            case "JACK" -> 11;
            case "QUEEN" -> 12;
            case "KING" -> 13;
            default -> Integer.parseInt(cardValue);
        };
    }

    @Override
    public String toString() {
        return "Card{" +
                "code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
