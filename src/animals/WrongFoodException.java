package animals;

public class WrongFoodException extends Exception {
    private String message = "Не съедобно";
    public String getException() {
        return  message;
    }
}
