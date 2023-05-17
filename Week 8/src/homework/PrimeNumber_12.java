package homework;

import java.util.Scanner;

/* 12. Write a programme to input any number and check if it is prime or not.

    (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
    prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
    17... are the prime numbers.)
 */


public class PrimeNumber_12 {
    public static void main(String[] args) {
        System.out.println("Enter Any number and Check is prime or not: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPrime(number)){
            System.out.println(number +" is a prime number");
        }else {
            System.out.println(number +" is not a prime number");
        }
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }

        for(int i=2;i<Math.sqrt(number);i++){
            if(number%2==0){
                return false;
            }
        }
        return true;
    }
}
