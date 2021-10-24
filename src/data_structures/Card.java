package data_structures;

import data_structures.cards_enum.Symbol;
import data_structures.cards_enum.Value;

public class Card {
 private Value value;
 private Symbol symbol;

    public Card(Value value, Symbol symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return value + " OF "+symbol+"S";
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
