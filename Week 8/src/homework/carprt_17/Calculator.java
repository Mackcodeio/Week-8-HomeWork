package homework.carprt_17;

public class Calculator {
    Floor floor;
    Carprt carprt;

    public Calculator(Floor floor, Carprt carprt) {
        this.floor = floor;
        this.carprt = carprt;
    }
    public double getTotalCost() {
        return floor.getArea() * carprt.getCost();
    }

    public static void main(String[] args) {
        Carprt carpet = new Carprt(3.5);
        Floor floor = new Floor(2.75, 4.0);

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

}
