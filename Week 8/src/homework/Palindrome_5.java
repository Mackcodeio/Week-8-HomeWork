package homework;

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
