package animals;

public class Monkey extends Herbivore implements Run, Voice{

    public Monkey(String name){
        this.satiety = 3;
        this.animal = "Обезьянка";
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
        System.out.println("Обезьяна бегает");
    }

    public void move() { System.out.println("Обезьянка не торопливо лезет по дереву"); }

    public String voice() {
        return "Уааа..Уаа";
    }

    public void silence() { System.out.println("Обезьяна успокоилась"); }

    public boolean equals(Object obj) {
        if(obj instanceof Monkey) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
