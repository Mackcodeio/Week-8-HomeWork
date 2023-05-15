package homework;

public class DigitSum_7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        System.out.println("number------"+number);
        int firstDigit = 0;
        int lastDigit = 0;
        int sum=0;

        // To find the last digit of the number : taking modulo with 10
        lastDigit = Math.abs(number % 10);

        // To find the first digit of the number
        while (number != 0) {
            firstDigit = Math.abs(number % 10); // ... first get lastdigit and loop go on unitl not get first digit.
            number = number/10;
        }

        sum = firstDigit + lastDigit;

        return sum;
    }
}

