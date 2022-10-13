package ua.com.toryzhel.phone;
import java.util.Arrays;

public class Phone {
    private String model;
    private String number;
    private double diagonal;

    public Phone(String model, String number, double diagonal) {
        this(model, number);
        this.diagonal = diagonal;
    }

    public Phone(String model, String number) {
        this();
        this.model = model;
        this.number = number;
    }

    public Phone(){
    }

    void receiveCall (String name){
        System.out.println("Calling " + name);
    }

    void receiveCall (String name, String number){
        System.out.println("Calling " + name + " with number " + number);
    }

    public String getNumber(){
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    void sendMessage (String message, String... numbers){
        System.out.println("Message " + message + "is sending to: " +
                Arrays.deepToString(numbers));
    }

}
