package data;

public enum Symbol {
    TWO("Dwójka", "Two"),
    THREE("Trójka", "Three"),
    FOUR("Czwórka", "Four"),
    FIVE("Piątka", "Five"),
    SIX("Szóstka", "Six"),
    SEVEN("Siódemka", "Seven"),
    EIGHT("Ósemka", "Eight"),
    NINE("Dziewiątka", "Nine"),
    TEN("Dziesiątka", "Ten"),
    JACK_FIGURE("Walet", "Jack"),
    QUEEN_FIGURE("Dama", "Queen"),
    KING_FIGURE("Król", "King"),
    ACE_FIGURE("As", "Ace");


    private String polishTranslation;
    private String englishTranslation;

    Symbol(String polishTranslation, String englishTranslation) {
        this.polishTranslation = polishTranslation;
        this.englishTranslation = englishTranslation;
    }

    public String getPolishTranslation() {
        return polishTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

}



