import java.util.Random;

public class Building implements HasHealthPoint {
    private final int maxHealthPoint;
    private int currentHealthPoint;

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = randomHP();
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public int randomHP() {
        Random r = new Random();
        int radnomValue = r.nextInt(maxHealthPoint);
        return radnomValue;
    }

    @Override
    public String toString() {
        return "maxHP=" + maxHealthPoint + "; currentHP=" + currentHealthPoint;
    }
}