package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Run, Swim, Voice{

    public Duck(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void run() {
        System.out.println("Утка побежала");
    }
    public void swim() {
        System.out.println("Утка поплыла");
    }
    public String voice() {
        return "Кря.....";
    }
    public void eat(Food food) {
        if(food instanceof Grass){
            addSatiety();
        } else {
            System.out.println("Не съедобно для утки!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Утку покормили, сытость : " + satiety);
    }
}
