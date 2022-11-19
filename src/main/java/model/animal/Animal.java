package model.animal;

import model.Inhabitant;

public class Animal extends Inhabitant {
    protected final int speed;
    protected final int maxQuantityOnCell;
    protected final float maxSatiety;

    protected Animal(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight);
        this.speed = speed;
        this.maxQuantityOnCell = maxQuantityOnCell;
        this.maxSatiety = maxSatiety;
    }
}
