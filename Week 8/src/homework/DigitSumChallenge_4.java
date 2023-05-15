package homework;

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
