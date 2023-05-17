package homework;

/*
    7. First And Last Digit Sum
    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needs to find the first and the last digit of the parameter number passed to the method,
    using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needs to return -1 to indicate an invalid value
* */
public class DigitSum_7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){

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

