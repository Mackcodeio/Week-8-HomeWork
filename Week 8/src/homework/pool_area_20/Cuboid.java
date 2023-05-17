package homework.pool_area_20;

/*
2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
(instance variable) with name height of type double.
The class needsto have one constructor with three parameters width, length, and height all of type
double. It needsto call the parent constructor and initialize a height field.
In case the height parameter islessthan 0 it needsto set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needsto return the value of height
field.
● Method named getVolume without any parameters, it needsto return the calculated volume.
To calculate volume, multiply the area with height.
* */
public class Cuboid extends Rectangle{

    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0){
            height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
