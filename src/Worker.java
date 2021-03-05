import animals.*;
import food.Food;

public class Worker {
    public void feed(Food food, Animals animal){
        animal.eat(food);
    }
    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
