// Jonathan Sonnek
// March 6, 2026
// Array Mod APP

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many data points do you have? (up to 20)");
        int n = input.nextInt();
        int[] dataPoints = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data point " + (i + 1) + ":");
            dataPoints[i] = input.nextInt();
        }
        while (true) {
            System.out.println("Do you want to modify another data point? (y/n)");
            String response = input.next();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Enter the position of the data point to change (Starting at 1):");
            int s = input.nextInt();
            System.out.println("Enter the new value of the data point:");
            int newValue = input.nextInt();
            dataPoints[s - 1] = newValue;
            System.out.println("The current data points are: " + Arrays.toString(dataPoints));
        }
    }
}