package model.animal.herbivore;

import model.animal.AbleToEat;
import model.animal.Animal;
import model.animal.Eatable;

public class Duck extends Animal implements Eatable, AbleToEat {
    public Duck(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super(name, symbol, weight, speed, maxQuantityOnCell, maxSatiety);
    }
}
