package data;

public class Card {
    Color color;
    Symbol symbol;

    public Card(Color color, Symbol symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "data.Card{" +
                "color=" + color +
                ", symbol=" + symbol +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
