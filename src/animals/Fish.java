package animals;

public class Fish extends Carnivorous implements Swim{

    public Fish(String name){
        this.satiety = 15;
        this.animal = "Рыбка";
        this.size = AviarySize.LITTLE;
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getAnimal() { return animal; }

    public String getName() { return name; }

    public AviarySize getSize() { return size; }

    public void swim() {
        System.out.println("Рыбка плавает");
    }

    public void dive() { System.out.println("Рыбка глубоко нырнула"); }

    public boolean equals(Object obj) {
        if(obj instanceof Fish) return true;
        return false;
    }
    public int hashCode() {
        return (super.hashCode())/10;
    }
}
