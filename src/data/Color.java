package data;

public enum Color {
    TREFL("żołądź", "clubs"),
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    PIK("wino", "spades");

    private String polishTranslation;
    private String englishTranslation;

    Color(String polishTranslation, String englishTranslation) {
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
