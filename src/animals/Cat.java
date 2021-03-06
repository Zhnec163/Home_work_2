package animals;

import food.Food;
import food.Grass;

public class Cat extends Herbivore implements Run, Voice{

    public Cat(int satiety){
        this.satiety = satiety;
        this.name = "Кот";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

    public void run() {
        System.out.println("Кот бегает");
    }
    public void move() { System.out.println("Кот не торопливо идет"); }
    public String voice() {
        return "Мяуу...";
    }
    public void silence() { System.out.println("Кот больше не мяукает"); }
    public void eat(Food food) {
        if(food instanceof Grass){
            addSatiety();
        } else {
            System.out.println("Не съедобно для кота!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Кота покормили, сытость : " + satiety);
    }
}
