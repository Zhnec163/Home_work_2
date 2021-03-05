package animals;

import food.Food;
import food.Meat;

public class Wolf extends Carnivorous implements Run, Voice{

    public Wolf(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void run() {
        System.out.println("Волк бежит");
    }
    public String voice() {
        return "Ууу....";
    }
    public void eat(Food food) {
        if(food instanceof Meat){
            addSatiety();
        } else {
            System.out.println("Не съедобно для волка!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Волка покормили, сытость : " + satiety);
    }
}
