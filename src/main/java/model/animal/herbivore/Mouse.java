package model.animal.herbivore;

import model.animal.Animal;
import model.animal.carnivore.Carnivore;

public class Mouse extends Animal implements Carnivore,Herbivore {
    public Mouse(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}
