package model;


public abstract class Inhabitant {
    protected final String name;
    protected final String symbol;
    protected final int weight;


    protected Inhabitant(String name, String symbol, int weight) {
        this.name = name;
        this.symbol = symbol;
        this.weight = weight;
    }



    protected void move() {

    }

    protected void breed() {

    }

    @Override
    public String toString() {
        return symbol;
    }
}
