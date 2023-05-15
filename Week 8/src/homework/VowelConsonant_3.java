package homework;

import java.util.Scanner;

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
