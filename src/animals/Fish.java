package animals;

import food.Food;
import food.Meat;

public class Fish extends Carnivorous implements Swim{

    public Fish(int satiety){
        this.satiety = satiety;
        this.name = "Рыбка";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

    public void swim() {
        System.out.println("Рыбка плавает");
    }
    public void dive() { System.out.println("Рыбка глубоко нырнула"); }
    public void eat(Food food) {
        if(food instanceof Meat){
            addSatiety();
        } else {
            System.out.println("Не съедобно для рыбы!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Рыбку покормили, сытость : " + satiety);
    }
}
