package phil.homework.week1day2.Jungle;

import java.util.Random;

public enum Food {
    MEAT, FISH, BUGS, GRAIN;

    private static Random rng = new Random();
    public static Food getRandomFood() {
        switch(rng.nextInt(4)) {
            case 0: return MEAT;
            case 1: return FISH;
            case 2: return BUGS;
            default: return GRAIN;
        }
    }
}
