package homework;

import java.util.Scanner;

/*
 6. Write a program in Java to display the pattern like a triangle with a number.
    For eg.
    Input number of rows: 10

    Expected Output:
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    1234567891

* */

public class Patten_6 {
    public static void main(String[] args) {
        new Patten_6().patten();
    }

    public void patten(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numeric number: ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++)           // outer loop
        {
            for(int j=1;j<=i;j++)          // Inner loop: execute until value of current sistuaion number of i
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
