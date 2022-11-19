package model.animal.herbivore;

import model.animal.Animal;
import model.animal.Eatable;

public class Deer extends Animal implements Herbivore, Eatable {
    public Deer(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}
