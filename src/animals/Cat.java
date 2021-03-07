package animals;

public class Cat extends Herbivore implements Run, Voice{

    public Cat(String name){
        this.satiety = 8;
        this.animal = "Кот";
        this.size = AviarySize.LITTLE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getAnimal() { return animal; }

    public String getName() { return name; }

    public AviarySize getSize() { return size; }

    public void run() {
        System.out.println("Кот бегает");
    }

    public void move() { System.out.println("Кот не торопливо идет"); }

    public String voice() {
        return "Мяуу...";
    }

    public void silence() { System.out.println("Кот больше не мяукает"); }

    public boolean equals(Object obj) {
        if(obj instanceof Cat) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
