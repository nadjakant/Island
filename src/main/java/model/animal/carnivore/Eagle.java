package model.animal.carnivore;


import model.animal.Animal;


public class Eagle extends Animal implements Carnivore {


    public Eagle(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Eagle", "\uD83E\uDD85", 6, 2, 30, 1);
    }


}
