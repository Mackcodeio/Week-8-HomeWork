package homework;

import java.util.Scanner;

// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number
public class Fibonacci_9 {

    static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.print(n1+" "+n2);
        printFibonacci(count-2);
    }

    public static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
   }
}

