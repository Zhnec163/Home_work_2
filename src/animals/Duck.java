package animals;

public class Duck extends Herbivore implements Run, Swim, Voice{

    public Duck(String name){
        this.satiety = 5;
        this.animal = "Утка";
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
        System.out.println("Утка побежала");
    }

    public void move() { System.out.println("Утка куда то идет"); }

    public void swim() {
        System.out.println("Утка поплыла");
    }

    public void dive() { System.out.println("Утка нырнула вод воду"); }

    public String voice() {
        return "Кря.....";
    }

    public void silence() { System.out.println("Утка наконец то успокоилась"); }

    public boolean equals(Object obj) {
        if(obj instanceof Duck) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
