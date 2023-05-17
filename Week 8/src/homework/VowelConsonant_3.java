package homework;

import java.util.Scanner;

/*
    3. Write a Java program that takes the user to provide a single character from the
       alphabet. Print Vowel of Consonant, depending on the user input. If the user input
       Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
       error message.

        For eg:
            Input an alphabet: p
            Expected Output:
            Input letter is Consonant

* */
public class VowelConsonant_3 {
    public static void main(String[] args) {

        new VowelConsonant_3().checkIsVowelConsonant();
    }
    public void checkIsVowelConsonant(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U' )
        {
            System.out.println(ch + " is Vowel");
        }else {
            System.out.println(ch + " is Consonant");
        }
    }
}
