package model.animal.omnivore;

import model.animal.Animal;
import model.animal.Eatable;
import model.animal.herbivore.Herbivore;

public class Goat extends Animal implements Omnivore, Herbivore, Eatable {
    public Goat(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}