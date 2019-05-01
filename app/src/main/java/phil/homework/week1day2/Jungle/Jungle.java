package phil.homework.week1day2.Jungle;

import java.util.*;

public class Jungle {
    private static Jungle jungle = new Jungle();
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

    public void liveLife() {
        Iterator i = circleOfLife.iterator();
        while(i.hasNext()) {
            Animal a = (Animal) i.next();
            a.doSomething();
        }
    }

    public static void main(String[] args) {
        Monkey bobo = new Monkey(24);
        jungle.addAnimal(bobo);
        bobo.makeSound();
        bobo.play();
        bobo.eatFood(Food.BUGS);
        bobo.sleep();

        Snake slithers = new Snake(18);
        jungle.addAnimal(slithers);
        slithers.sleep();
        slithers.sleep();
        slithers.sleep();
        slithers.eatFood(Food.MEAT);
        slithers.makeSound();
        slithers.sleep();

        Tiger elTigre = new Tiger( 10);
        jungle.addAnimal(elTigre);
        elTigre.eatFood(Food.FISH);
        elTigre.eatFood(Food.MEAT);
        elTigre.eatFood(Food.GRAIN);
        elTigre.makeSound();
        elTigre.sleep();

        jungle.liveLife();
        jungle.soundOff();
    }
}
