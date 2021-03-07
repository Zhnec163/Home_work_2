package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals {
    public void eat(Food food, Animals animals) {
        try {
            if (food instanceof Grass) {
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
