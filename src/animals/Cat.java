package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Cat extends Herbivore implements Run, Voice{

    public Cat(String name){
        this.satiety = satiety;
        this.animal = "Кот";
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
        System.out.println("Кот бегает");
    }
    public void move() { System.out.println("Кот не торопливо идет"); }
    public String voice() {
        return "Мяуу...";
    }
    public void silence() { System.out.println("Кот больше не мяукает"); }
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
        System.out.println("Кота покормили, сытость : " + satiety);
    }

    public boolean equals(Object obj) {
        if(obj instanceof Cat) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
