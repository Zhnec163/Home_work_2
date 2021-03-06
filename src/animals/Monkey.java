package animals;

import food.Food;
import food.Grass;

public class Monkey extends Herbivore implements Run, Voice{

    public Monkey(int satiety){
        this.satiety = satiety;
        this.name = "Обезьянка";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

    public void run() {
        System.out.println("Обезьяна бегает");
    }
    public void move() { System.out.println("Обезьянка не торопливо лезет по дереву"); }
    public String voice() {
        return "Уааа..Уаа";
    }
    public void silence() { System.out.println("Обезьяна успокоилась"); }
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
