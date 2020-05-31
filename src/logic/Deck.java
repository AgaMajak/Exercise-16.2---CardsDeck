package logic;

import data.Card;
import data.Color;
import data.Symbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck {
    private static String POLISH = "PL";
    private static String ENGLISH = "EN";

    public static List<Card> createDeckOfCards() {
        Symbol[] symbols = Symbol.values();
        Color[] colors = Color.values();
        List<Card> cards = new ArrayList<>();
        for (Color color : colors) {
            for (Symbol symbol : symbols) {
                cards.add(new Card(color, symbol));
            }
        }
        return cards;
    }

    private static void showDeckInPolish(List<Card> cardList) {
        for (Card card : cardList) {
            System.out.println(card.getSymbol().getPolishTranslation() + " " + card.getColor().getPolishTranslation());
        }
    }

    private static void showDeckInEnglish(List<Card> cardList) {
        for (Card card : cardList) {
            System.out.println(card.getSymbol().getEnglishTranslation() + " of " + card.getColor().getEnglishTranslation());
        }
    }

    public static void showDeckInLanguageFromUserInput(List<Card> cardList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj język w jakim ma zostać wyświetlona talia kart. Wpisz: PL/EN");
        String userInput = scanner.nextLine();
        scanner.close();
        if (userInput.equalsIgnoreCase(POLISH)) {
            showDeckInPolish(cardList);
        } else if (userInput.equalsIgnoreCase(ENGLISH)) {
            showDeckInEnglish(cardList);
        } else
            System.out.println("Język nieobsługiwany. Spróbuj jeszcze raz.");
    }
}



