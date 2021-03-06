import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {
        Fish fish = new Fish(10);
        Wolf wolf = new Wolf(7);
        Bear bear = new Bear(3);
        Duck duck = new Duck(15);
        Monkey monkey = new Monkey(8);
        Cat cat = new Cat(9);

        Herb herb = new Herb();
        Banana banana = new Banana();
        VegetableFeed vegetableFeed = new VegetableFeed();
        Worm worm = new Worm();
        Steak steak = new Steak();
        MeatFeed meatFeed = new MeatFeed();

        Animals[] animals = { fish, wolf, bear, duck, monkey, cat};

        Food[] foods = {herb, banana, vegetableFeed, worm, steak, meatFeed};

        Worker worker = new Worker();

        for (int i = 0; i < animals.length; i++){
            System.out.println((i + 1) + " " + animals[i].getName());
            if(Voice.class.isAssignableFrom(animals[i].getClass())){
                System.out.print("Говорит: ");
                worker.getVoice((Voice)animals[i]);
                System.out.println();
            }
            for (int j = 0; j < foods.length; j++){
                System.out.println("Даем " + animals[i].getName() + ": " + foods[j].getFoodName());
                worker.feed(foods[j], animals[i]);
            }
            System.out.println();
        }

        Swim[] pond = { new Fish(5), new Duck(3), new Fish(6)};

        System.out.println("\n");
        for (Swim item : pond) {
            item.swim();
        }
    }
}
