package model.animal.herbivore;

import model.animal.Animal;

public class Caterpillar extends Animal implements Herbivore {

    public Caterpillar(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}
