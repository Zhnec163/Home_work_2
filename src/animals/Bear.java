package animals;

import food.Food;
import food.Meat;

public class Bear extends Carnivorous implements Run, Voice{

    public Bear(int satiety){
        this.satiety = satiety;
        this.name = "Медведь";
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() { return name; }

    public void run() {
        System.out.println("Медведь бежит");
    }
    public void move() { System.out.println("Медведь медленно идет"); }
    public String voice() {
        return "Рррр.....";
    }
    public void silence() { System.out.println("Медведь больше не рычит"); }
    public void eat(Food food) {
        if(food instanceof Meat){
            addSatiety();
        } else {
            System.out.println("Не съедобно для медведя!");
        }
    }

    private void addSatiety(){
        satiety += 5;
        System.out.println("Медведя покормили, сытость : " + satiety);
    }
}
