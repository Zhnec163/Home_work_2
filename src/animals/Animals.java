package animals;

import food.Food;

public abstract class Animals {
    public abstract void eat(Food food, Animals animals);
    protected int satiety;
    public abstract int getSatiety();
    protected String animal;
    public abstract String getAnimal();
    protected String name;
    public abstract String getName();
    protected AviarySize size;
    public abstract AviarySize getSize();
}
