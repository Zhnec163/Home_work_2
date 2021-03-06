package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Run, Swim, Voice{

    public Duck(int satiety){
        this.satiety = satiety;
        this.name = "Утка";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

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
