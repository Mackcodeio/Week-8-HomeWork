package homework;

/*

15. Display left angle triangle of * using nested for loops
    *
    * *
    * * *
    * * * *
    * * * * *

* */
public class Triangle_15 {
    public static void main(String[] args) {
        new Triangle_15().nestedLoop();
    }

    public void nestedLoop(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
