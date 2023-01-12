import java.util.Random;

public class CustomNumber {
    public static void main(String[] args) {

    }

    int number;

    public CustomNumber(){
        Random nr = new Random();
        this.number = nr.nextInt(12) + 1;
        System.out.println("Generated number: " + number);
    }

    public void getMultiplicationTable(int table) {
        for (int i = 12; i >= 1; i--){
            System.out.println(table + " x " + i + " = " +(table*i));
        }

    }

}