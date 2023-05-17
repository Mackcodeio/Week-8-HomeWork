package homework;

/*
Write a program in Java to display the pattern like a diamond.
While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
   *****
    ***
     *

* */
public class Diamond_14 {

    public static void main(String[] args) {

        new Diamond_14().diamondPatten();
    }

    public void diamondPatten(){
        //Scanner sc = new Scanner(System.in);
        int num = 7;
        int i,j;

        for(i=0;i<=num;i++)
        {
            for(j=1;j<=num-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=num-1;i>=1;i--)
        {
            for(j=1;j<=num-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
