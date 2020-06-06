import data.Card;
import logic.Deck;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> cards = Deck.createDeckOfCards();
        Deck.showDeckInLanguageFromUserInput(cards);

    }
}
