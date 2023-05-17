package homework.pool_area_20;

/*
1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.

In case the width parameter is lessthan 0 it needs to set the width field value to 0.
In case the length parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getWidth without any parameters, it needsto return the value of the width
field.
● Method named getLength without any parameters, it needsto return the value ofthe length
field.
● Method named getArea without any parameters, it needsto return the calculated area
(width * length).
* */
public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return width * length;
    }
}
