package GeneralClasses;

public class Character {
    private int id;
    private String filmName;
    private String characterName;
    private String img;

    public Character(int id, String filmName, String characterName, String img) {
        this.id = id;
        this.filmName = filmName;
        this.characterName = characterName;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", filmName='" + filmName + '\'' +
                ", characterName='" + characterName + '\'' +
                '}';
    }
}
