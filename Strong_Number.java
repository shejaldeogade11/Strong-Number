package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

// Strong number means the sum of the factorial of each digit is equal to the given number
public class Strong_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();   // Example: 145
        int number = num;
        int sum = 0;

        while (num != 0) {
            int d = num % 10; // get the last digit
            int fact = 1; 

            // Calculate factorial of the digit
            for (int i = d; i >= 1; i--) {
                fact = fact * i;
            }

            sum = sum + fact; // Add the factorial to the sum
            num = num / 10; // Remove the last digit
        }

        System.out.println("Sum of factorials of digits: " + sum);

        if (sum == number) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}