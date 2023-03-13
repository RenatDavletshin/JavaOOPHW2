import java.util.Random;

public class Human implements Tiredness {
    private final int maxHealthPoint;
    private int currentHealthPoint;
    private final int maxEnergy;
    private int CurrentEnergy;

    public Human(int maxHealthPoint, int maxEnergy) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = randomHP();
        this.maxEnergy = maxEnergy;
        this.CurrentEnergy = randomEnergy();
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxEnergy() {
        return maxEnergy;
    }

    @Override
    public int getCurrentEnergy() {
        return CurrentEnergy;
    }

    public int randomHP() {
        Random r = new Random();
        int radnomValue = r.nextInt(maxHealthPoint);
        return radnomValue;
    }

    public int randomEnergy() {
        Random r = new Random();
        int radnomValue = r.nextInt(maxEnergy);
        return radnomValue;
    }

    @Override
    public String toString() {
        return "maxHP=" + maxHealthPoint + "; currentHP=" + currentHealthPoint + "; maxEnergy=" + maxEnergy + "; currentEnergy=" + CurrentEnergy;
    }
}