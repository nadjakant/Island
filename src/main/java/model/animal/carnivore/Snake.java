package model.animal.carnivore;


import model.animal.Animal;
import model.animal.Eatable;

public class Snake extends Animal implements Carnivore, Eatable {


    public Snake(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Snake", "\uD83D\uDC0D", 15, 1, 30, 3);
    }


}
