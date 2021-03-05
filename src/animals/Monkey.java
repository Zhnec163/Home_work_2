package animals;

import food.Food;
import food.Grass;

public class Monkey extends Herbivore implements Run, Voice{

    public Monkey(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void run() {
        System.out.println("Обезьяна бегает");
    }
    public String voice() {
        return "Уааа..Уаа";
    }
    public void eat(Food food) {
        if(food instanceof Grass){
            addSatiety();
        } else {
            System.out.println("Не съедобно для обезьяны!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Обезьянку покормили, сытость : " + satiety);
    }
}
