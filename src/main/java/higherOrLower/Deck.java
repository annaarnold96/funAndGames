package higherOrLower;

public class Deck {

    private String deckId;
    private String remaining;
    private String shuffled;

    public Deck(String deckId, String remaining, String shuffled) {
        this.deckId = deckId;
        this.remaining = remaining;
        this.shuffled = shuffled;
    }

    public String getDeckId() {
        return deckId.replace("\"", "");
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public String getRemaining() {
        return remaining.replace("\"", "");
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public String getShuffled() {
        return shuffled.replace("\"", "");
    }

    public void setShuffled(String shuffled) {
        this.shuffled = shuffled;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckId='" + deckId + '\'' +
                ", remaining='" + remaining + '\'' +
                ", shuffled='" + shuffled + '\'' +
                '}';
    }
}
