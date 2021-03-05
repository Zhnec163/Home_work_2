import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {
        Animals fish = new Fish(10);
        Animals wolf = new Wolf(7);
        Animals bear = new Bear(3);
        Animals duck = new Duck(15);
        Animals monkey = new Monkey(8);
        Animals cat = new Cat(9);

        Food herb = new Herb();
        Food banana = new Banana();
        Food vegetableFeed = new VegetableFeed();
        Food worm = new Worm();
        Food steak = new Steak();
        Food meatFeed = new MeatFeed();

        Animals[] animals = {fish, wolf, bear, duck, monkey, cat};

        Food[] foods = {herb, banana, vegetableFeed, worm, steak, meatFeed};

        Worker worker = new Worker();
        worker.getVoice((Voice)cat);

        for (Animals itemAnimals : animals){
            System.out.println("\n");
            for (Food itemFoods : foods){
                worker.feed(itemFoods, itemAnimals);
            }
        }

        Swim[] pond = { new Fish(5), new Duck(3), new Fish(6)};

        System.out.println("\n");
        for (Swim item : pond) {
            item.swim();
        }
    }
}
