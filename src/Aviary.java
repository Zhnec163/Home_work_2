import animals.*;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {
    private HashMap aviary = new HashMap<T, String>();
    private AviarySize aviarySize;
    private Class<T> typeAviary;

    public Aviary(AviarySize aviarySize, Class<T> type){
        this.aviarySize = aviarySize;
        this.typeAviary = type;
    }

    public Class getTypeAviary(){
        System.out.print("Вольер для животных типа: ");
        return typeAviary;
    }

    public void addAnimal(T animal){
        if(((Animals)animal).getSize().getValue() <= aviarySize.getValue()){
            aviary.put(animal, ((Animals)animal).getName());
            System.out.println("Животное поместили в вольер");
        } else {
            System.out.println("Животное слишком большое для этого вальера");
        }
    }

    public void removeAnimal(T animal){
        aviary.remove(animal);
        System.out.println("Животное удалено из вольера");
    }

    public T getAnimalByName(String name){
        if (getKeyFromValue(aviary, name) != null ){
            System.out.println("Вы позвали " + name);
            return getKeyFromValue(aviary, name);
        }
        System.out.println("Животного с таким именем нет!");
        return null;
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
