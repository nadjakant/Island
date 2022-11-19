package model.animal.carnivore;


import model.animal.Animal;
import model.animal.Eatable;
import model.animal.herbivore.Herbivore;


public class Buffalo extends Animal implements Herbivore, Eatable {


    public Buffalo(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Buffalo", " \uD83D\uDC03", 700, 3, 10, 100);
    }


}
