package animals;

public enum AviarySize {
    LITTLE(2), MIDDLE(5), LARGE(8), HUGE(10);

    private int value;
    private AviarySize(int value){
        this.value = value;
    }

    public int getValue(){
        return  value;
    }
}