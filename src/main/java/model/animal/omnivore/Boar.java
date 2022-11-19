package model.animal.omnivore;


import model.animal.AbleToEat;
import model.animal.Animal;
import model.animal.Eatable;

public class Boar extends Animal implements Omnivore,Eatable, AbleToEat {


    public Boar(String name, String symbol, int weight, int speed, int maxQuantityOnCell, float maxSatiety) {
        super("Boar", "\uD83D\uDC17", 400, 2, 50, 50);
    }


}
