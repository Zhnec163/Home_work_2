package animals;

import food.Food;
import food.Meat;

public class Fish extends Carnivorous implements Swim{

    public Fish(String name){
        this.satiety = satiety;
        this.animal = "Рыбка";
        this.size = AviarySize.LITTLE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }
    public String getAnimal() { return animal; }
    public String getName() { return name; }
    public AviarySize getSize() { return size; }

    public void swim() {
        System.out.println("Рыбка плавает");
    }
    public void dive() { System.out.println("Рыбка глубоко нырнула"); }
    public void eat(Food food) {
        try {
            if (food instanceof Meat) {
                addSatiety();
            } else {
                throw new WrongFoodException();
            }
        } catch (WrongFoodException ex){
            System.out.println(ex.getException() + ", дайте что то другое!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Рыбку покормили, сытость : " + satiety);
    }

    public boolean equals(Object obj) {
        if(obj instanceof Fish) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
