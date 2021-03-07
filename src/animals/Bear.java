package animals;

public class Bear extends Carnivorous implements Run, Voice{

    public Bear(String name){
        this.satiety = 10;
        this.animal = "Медведь";
        this.size = AviarySize.LARGE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getAnimal() { return animal; }

    public String getName() { return name; }

    public AviarySize getSize() { return size; }

    public void run() {
        System.out.println("Медведь бежит");
    }

    public void move() { System.out.println("Медведь медленно идет"); }

    public String voice() {
        return "Рррр.....";
    }

    public void silence() { System.out.println("Медведь больше не рычит"); }

    public boolean equals(Object obj) {
        if(obj instanceof Bear) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
