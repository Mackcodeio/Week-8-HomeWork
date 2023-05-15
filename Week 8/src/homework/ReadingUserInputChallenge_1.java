package homework;

import java.util.Scanner;

public class ReadingUserInputChallenge_1 {
    public static void main(String[] args) {
        ReadingUserInputChallenge_1 redingNumber = new ReadingUserInputChallenge_1();
        redingNumber.sumOfNumber();
    }

    public void sumOfNumber(){
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count <= 10) {
            System.out.print("Enter number #" + count +" ");

            boolean validateNumber = scanner.hasNextInt();
            if(validateNumber) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }

        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }
}
