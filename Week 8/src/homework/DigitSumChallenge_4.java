package homework;

/*
    4. Digit Sum Challenge

    Write a method with the name sumDigits that has one int parameter called number.

    If the parameter is >= 10 then the method should process the number and return sum of all digits,
    otherwise return -1 to indicate an invalid value.

    The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
    negative numbers, so also return -1 for negative numbers.

    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    Calling the method sumDigits(1)should return -1 as per requirements described above.
    Add some code to the main method to test out the sumDigits method to determine that it is working
    correctly for valid and invalid values passed as arguments.

* */
public class DigitSumChallenge_4 {

    static int sum = 0;
    public static void main(String[] args) {
        int valid = sumDigit(125);
        int inValid = sumDigit(1);

        System.out.println("Valid Output sum of 125: "+valid);
        System.out.println("InValid Output sum of 1: "+inValid);
    }

    public static int sumDigit(int number){

            if(number != 0 ){
                sum = sum + number % 10;  // finds the last digit from the number and add it to the variable sum
                number = number / 10;   // removes the last digit by diving the number by 10
                sumDigit(number);      // function called agian until not equal to number = 0
            }

            if (number >= 10) {
                return sum;
            }else {
                return -1;
            }
    }
}
