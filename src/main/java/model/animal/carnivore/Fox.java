package model.animal.carnivore;


import model.animal.Animal;
import model.animal.Eatable;


public class Fox extends Animal implements Carnivore, Eatable {


    public Fox(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Fox", "\uD83E\uDD8A", 8, 2, 30, 2);
    }

}
