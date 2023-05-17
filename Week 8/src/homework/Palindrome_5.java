package homework;

/*
5. Write a method called isPalindrome with one int parameter called number.
   The method needs to return a boolean.
   It should return true if the number is a palindrome number otherwise it should return false.
   Check the tips below for more info about palindromes.

    Example Input/Output
    isPalindrome(-1221); → should return true
    isPalindrome(707); → should return true
    isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
    11212.
* */
public class Palindrome_5 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(234432));
        System.out.println(isPalindrome(-1221));;
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number) {

        int lastDigitNumber;
        int reverse = 0;
        int temp = number;
        while (number > 0) {
            lastDigitNumber = number % 10;
            reverse = (reverse * 10) + lastDigitNumber;
            number = number / 10;
        }

        if (reverse == temp) {
            return true;
        } else {
            return false;
        }
    }
}
