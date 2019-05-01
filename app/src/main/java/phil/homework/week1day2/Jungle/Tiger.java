package phil.homework.week1day2.Jungle;

public class Tiger extends Animal {
    private static int count = 0;

    public Tiger(int energy) {
        super(energy);
        count++;
    }

    @Override public void makeSound() {
        System.out.println("RAWR!");
        this.energy -= 3;
    }

    @Override public void sleep() {
        System.out.println("Zzz...");
        this.energy += 5;
    }

    @Override public void eatFood(Food food) {
        if(food == Food.GRAIN) {
            System.out.println("Tigers are obligate carnivores you MONSTER!");
        } else {
            System.out.println("Mmm.");
            this.energy += 5;
        }
    }
}
