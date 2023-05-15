package homework;

import java.util.Scanner;

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

