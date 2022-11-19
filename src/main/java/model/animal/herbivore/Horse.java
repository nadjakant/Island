package model.animal.herbivore;

import model.animal.Animal;
import model.animal.Eatable;
import model.animal.carnivore.Carnivore;

public class Horse extends Animal implements Carnivore, Eatable {
    public Horse(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}
