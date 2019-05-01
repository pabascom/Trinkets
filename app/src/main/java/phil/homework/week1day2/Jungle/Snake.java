package phil.homework.week1day2.Jungle;

public class Snake extends Animal {
    private static int count = 0;

    public Snake(int energy) {
        super(energy);
        count++;
    }

    public void makeSound() {
        System.out.println("Hssssss!");
        this.energy -= 3;
    }
}
