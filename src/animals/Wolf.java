package animals;

import food.Food;
import food.Meat;

public class Wolf extends Carnivorous implements Run, Voice{

    public Wolf(int satiety){
        this.satiety = satiety;
        this.name = "Волк";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

    public void run() {
        System.out.println("Волк бежит");
    }
    public void move() { System.out.println("Волк медленно обходит территорию"); }
    public String voice() {
        return "Ууу....";
    }
    public void silence() { System.out.println("Волк перестал выть на луну"); }
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
