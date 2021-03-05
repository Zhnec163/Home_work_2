package animals;

import food.Food;
import food.Grass;

public class Cat extends Herbivore implements Run, Voice{

    public Cat(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void run() {
        System.out.println("Кот бегает");
    }
    public String voice() {
        return "Мяуу...";
    }
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
