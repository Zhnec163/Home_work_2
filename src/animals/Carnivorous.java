package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animals {
    public void eat(Food food, Animals animals) {
        try {
            if (food instanceof Meat) {
                satiety += 7;
                System.out.println(animals.getAnimal() + " покормилен, сытость : " + satiety);
            } else {
                throw new WrongFoodException();
            }
        } catch (WrongFoodException ex){
            System.out.println(ex.getException() + ", дайте что то другое!");
        }
    }
}
