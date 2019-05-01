package phil.homework.week1day2.Jungle;

public class Monkey extends Animal {
    private static int count = 0;

    public Monkey(int energy) {
        super(energy);
        count++;
    }

    @Override public void eatFood(Food food) {
        System.out.println("Nomnomnom");
        this.energy += 2;
    }

    @Override public void makeSound() {
        System.out.println("Ooo Ooo Ahh Ahh");
        this.energy -= 4;
    }

    public void play() {
        if(this.energy >= 8) {
            System.out.println("Oooo Oooo Oooo");
            this.energy -= 8;
        } else {
            System.out.println("Monkey is too tired.");
        }
    }
}
