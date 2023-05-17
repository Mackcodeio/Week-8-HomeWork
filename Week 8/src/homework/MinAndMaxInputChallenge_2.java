package homework;

import java.util.Scanner;

/*
 2. -Read the numbers from the console entered by the user and print the minimum
    and maximum number the user has entered.

    -Before the user entersthe number, print the message Enter number:
    -If the user enters an invalid number, break out of the loop and print the minimum and maximum
    number.
 */
public class MinAndMaxInputChallenge_2 {

    public static void main(String[] args) {
        MinAndMaxInputChallenge_2 obj = new MinAndMaxInputChallenge_2();
        obj.minMax();
    }

    public void minMax(){

        int maxNumber = 0;
        int minNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number: ");
            if(scanner.hasNextInt()) {

                int currentNumber = scanner.nextInt();

                if (currentNumber > maxNumber) {
                    maxNumber = currentNumber;
                }else {
                    minNumber = currentNumber;
                }
            } else  {
                break;
            }
        }

        System.out.println("=================== || Max and Min Number || ===================");
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Maximum number: " + maxNumber);

        scanner.close();
    }

}

