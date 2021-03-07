import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {
        Fish fish = new Fish("Сларк");
        Wolf wolf = new Wolf("Петя");
        Bear bear = new Bear("Боря");
        Duck duck = new Duck("Слава");
        Monkey monkey = new Monkey("Женя");
        Cat cat = new Cat("Бакс");

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
            System.out.println((i + 1) + " " + animals[i].getAnimal());
            if(Voice.class.isAssignableFrom(animals[i].getClass())){
                System.out.print("Говорит: ");
                worker.getVoice((Voice)animals[i]);
                System.out.println();
            }
            for (int j = 0; j < foods.length; j++){
                System.out.println("Даем " + animals[i].getAnimal() + ": " + foods[j].getFoodName());
                worker.feed(foods[j], animals[i]);
            }
            System.out.println();
        }

        Swim[] pond = { new Fish("Слардар"), new Duck("Костя"), new Fish("Тайдхантер")};

        for (Swim item : pond) {
            item.swim();
        }
        System.out.println("\n");

        Aviary<Carnivorous> a1 = new Aviary<>(AviarySize.MIDDLE, Carnivorous.class);
        a1.addAnimal(fish);
        a1.addAnimal(bear);
        System.out.println(a1.getTypeAviary() + "\n");

        Aviary<Herbivore> a2 = new Aviary<>(AviarySize.MIDDLE, Herbivore.class);
        a2.addAnimal(cat);
        a2.addAnimal(duck);
        a2.removeAnimal(duck);
        System.out.println(a2.getTypeAviary() + "\n");

        a2.getAnimalByName("Слава");
        a2.getAnimalByName("Бакс");
    }
}
