package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Duck extends Herbivore implements Run, Swim, Voice{

    public Duck(String name){
        this.satiety = satiety;
        this.animal = "Утка";
        this.size = AviarySize.LITTLE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }
    public String getAnimal() { return animal; }
    public String getName() { return name; }
    public AviarySize getSize() { return size; }

    public void run() {
        System.out.println("Утка побежала");
    }
    public void move() { System.out.println("Утка куда то идет"); }
    public void swim() {
        System.out.println("Утка поплыла");
    }
    public void dive() { System.out.println("Утка нырнула вод воду"); }
    public String voice() {
        return "Кря.....";
    }
    public void silence() { System.out.println("Утка наконец то успокоилась"); }
    public void eat(Food food) {
        try {
            if (food instanceof Grass) {
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
        System.out.println("Утку покормили, сытость : " + satiety);
    }

    public boolean equals(Object obj) {
        if(obj instanceof Duck) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
