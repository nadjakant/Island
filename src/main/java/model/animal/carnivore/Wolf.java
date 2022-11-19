package model.animal.carnivore;


import model.animal.Animal;

public class Wolf extends Animal implements Carnivore {



    public Wolf(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Wolf", "\uD83D\uDC3A", 50, 3, 30, 8);
    }


}
