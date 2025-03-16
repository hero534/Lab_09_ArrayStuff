import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0.00;
        int userInput = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        boolean done = false;
            for (int i = 0; i < dataPoints.length; i++) {
                dataPoints[i] = rnd.nextInt(100) + 1;
            } for (int dataPoint : dataPoints) {
                System.out.printf(dataPoint + " | ");
            } for (int dataPoint : dataPoints) {
            sum += dataPoint;
            }
            average = (double) sum / dataPoints.length;
                System.out.println("\nThe sum of the random array dataPoints is: " + sum);
                System.out.println("The average of the random array dataPoints is: " + average);
                    userInput = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100: ", 1, 100);
                        System.out.println("You entered: " + userInput);
            for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
                }
            } for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userInput) {
                    System.out.println("The value " + userInput + " was found at array index " + i);
                    done = true;
                    break;
            }
                } if (!done) {
                    System.out.println("The value " + userInput + " was not found in the array.");
                }
                    System.out.println("The value " + userInput + " was found " + count + " times in the array.");
            for (int i = 1; i < dataPoints.length; i++) {
                if (dataPoints[i] < min) {
                    min = dataPoints[i];
                }
                if (dataPoints[i] > max) {
                    max = dataPoints[i];
                }
            }
                    System.out.println("Minimum value: " + min);
                    System.out.println("Maximum value: " + max);
                    System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    } public static double getAverage(int values[]) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}