import java.util.Scanner;

public class MarksAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store marks for the five units
        double[] marks = new double[5];
        
        // Asking for marks input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        
        // Calculate the average
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        double average = sum / marks.length;
        
        // Display the average, rounded to two decimal places
        System.out.printf("The average marks are: %.2f%n", average);
    }
}






































