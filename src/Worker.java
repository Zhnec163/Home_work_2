import animals.*;
import food.Food;

public class Worker {
    public void feed(Food food, Animals animal){
        animal.eat(food, animal);
    }
    public void getVoice(Voice animal){
        System.out.print(animal.voice());
    }
}
