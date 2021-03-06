package animals;

import food.Food;

public abstract class Animals {
    public abstract void eat(Food food);
    protected int satiety;
    public abstract int getSatiety();
    protected String name;
    public abstract String getName();
}
