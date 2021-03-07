package animals;

public class Wolf extends Carnivorous implements Run, Voice{

    public Wolf(String name){
        this.satiety = 7;
        this.animal = "Волк";
        this.size = AviarySize.MIDDLE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getAnimal() { return animal; }

    public String getName() { return name; }

    public AviarySize getSize() { return size; }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void move() { System.out.println("Волк медленно обходит территорию"); }

    public String voice() {
        return "Ууу....";
    }

    public void silence() { System.out.println("Волк перестал выть на луну"); }

    public boolean equals(Object obj) {
        if(obj instanceof Wolf) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
