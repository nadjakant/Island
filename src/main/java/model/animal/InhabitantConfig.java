package model.animal;


import model.Inhabitant;
import model.animal.carnivore.*;
import model.animal.herbivore.*;
import model.animal.omnivore.Boar;
import model.animal.omnivore.Goat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class InhabitantConfig {
    private static List<Class<? extends Inhabitant>> inhabitantClassNames;
    private static Map<Class<? extends Inhabitant>, Map<Class<? extends Inhabitant>, Integer>> animalFightProbability;
    static {
        inhabitantClassNames = List.of(Bear.class, Boar.class, Buffalo.class, Eagle.class, Fox.class,
                Snake.class, Wolf.class, Caterpillar.class, Deer.class, Duck.class,
                Goat.class, Horse.class, Mouse.class, Rabbit.class, Sheep.class);
    }

    public static void animalFightProbabilityMap() {
        animalFightProbability = new HashMap<>();
        for (Class<? extends Inhabitant> inhabitantClassName : inhabitantClassNames) {
            animalFightProbability.put(inhabitantClassName, getAnimalHuntProbabilityMap(inhabitantClassName));
        }
    }

    private static Map<Class<? extends Inhabitant>, Integer> getAnimalHuntProbabilityMap(Class<? extends Inhabitant> hunterClassName) {
        Map<Class<? extends Inhabitant>, Integer> victimsMap = new HashMap<>();
        String hunterName = hunterClassName.getSimpleName().toLowerCase();
        PropertiesReader reader = new PropertiesReader("huntprobability");
        Properties victimsProbability = reader.loadProperties(hunterName);
        for (Class<? extends Inhabitant> victimClassName : inhabitantClassNames) {
            String name = victimClassName.getSimpleName();
            Integer probability = Integer.valueOf(victimsProbability.getProperty(name.toLowerCase()));
            victimsMap.put(victimClassName, probability);
        }
        return victimsMap;
    }


}