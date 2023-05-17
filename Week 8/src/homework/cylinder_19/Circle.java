package homework.cylinder_19;

/*
  1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
of type double.
The class needs to have one constructor with parameter radius of type double and it needsto initialize
the fields.
In case the radius parameter islessthan 0 it needsto set the radiusfield value to 0.
Write the following methods (instance methods):
● Method named getRadius without any parameters, it needsto return the value of the radius
field.
● Method named getArea without any parameters, it needsto return the calculated area
(radius * radius * PI). For PI use Math.PI constant.
* */
public class Circle {
    public double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
