package phil.homework.week1day2.Jungle;

import java.util.*;

public class Jungle {
    private List<Animal> circleOfLife;

    public Jungle() {
        circleOfLife = new ArrayList<Animal>();
    };

    public void addAnimal(Animal animal) {
        circleOfLife.add(animal);
    }

    public void soundOff() {
        Iterator i = circleOfLife.iterator();
        while(i.hasNext()) {
            Animal a = (Animal) i.next();
            a.soundOff();
        }
    }
}
