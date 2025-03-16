import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        userInput = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100: ", 1, 100);

            System.out.println("You entered: " + userInput);
    }
}