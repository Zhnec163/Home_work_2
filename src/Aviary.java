import animals.AviarySize;
import animals.Animals;
import animals.Bear;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {
    public HashMap aviary = new HashMap<T, String>();
    private AviarySize aviarySize;

    public Aviary(AviarySize aviarySize){
        this.aviarySize = aviarySize;
    }

    public void addAnimal(T animal){
        if(((Animals)animal).getSize().getValue() <= aviarySize.getValue()){
            aviary.put(animal, ((Animals)animal).getName());
        } else {
            System.out.println("Животное слишком большое для этого вальера");
        }
    }
    public void removeAnimal(T animal){
        aviary.remove(animal);
    }
    public T getAnimalByName(String name){
        return getKeyFromValue(aviary, name);
    }

    private T getKeyFromValue(Map hashMap, Object value) {
        for (Object item : hashMap.keySet()) {
            if (hashMap.get(item).equals(value)) {
                return (T)item;
            }
        }
        return null;
    }
}
