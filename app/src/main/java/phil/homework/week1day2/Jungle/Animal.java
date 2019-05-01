package phil.homework.week1day2.Jungle;

public class Animal {
    protected int energy;

    public Animal(int energy) {
        this.energy = energy;
    }

    public void makeSound() {
        System.out.println("Rar!");
        energy -= 3;
    }

    public void eatFood(Food food) {
        System.out.println("Mmmm.");
        energy += 5;
    }

    public void sleep() {
        System.out.println("Zzz...");
        energy += 10;
    }

    public void soundOff() {
        makeSound();
        System.out.println("I have " + energy + " energy.");
    }
}
