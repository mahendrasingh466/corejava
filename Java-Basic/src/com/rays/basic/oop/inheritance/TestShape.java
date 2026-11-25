package com.rays.basic.oop.inheritance;

public class TestShape {
public static void main(String[] args) {
	Circle c = new Circle();
	c.setBorderWidth(10);
c.setColor("red");
c.setRadius(18);
System.out.println(c.getBorderWidth());
System.out.println(c.getColor());
double areaOfCircle = c.areaOfCircle(c.getRadius());
System.out.println("area of Circle "+areaOfCircle);

Rectangle rectangle = new Rectangle();
rectangle.setBorderWidth(50);
rectangle.setColor("Orange");
rectangle.setLength(50);
rectangle.setWidth(100);
int areaOfRectangle = rectangle.areaOfRectangle(rectangle.getLength(), rectangle.getWidth());
System.out.println("area of rectangle is: "+areaOfRectangle);

System.out.println(rectangle.getBorderWidth());
System.out.println(rectangle.getColor());
System.out.println(rectangle.getLength());

System.out.println(rectangle.getWidth());

Triangle triangle =new Triangle();
triangle.setBorderWidth(50);
triangle.setColor("Orange");
triangle.setBase(500);
triangle.setHight(400);

double areaOfTriangle = triangle.areaOfTriangle(triangle.getBase(), triangle.getHight());
System.out.println("area Of Triangle :"+areaOfTriangle);

System.out.println(triangle.getBorderWidth());
System.out.println(triangle.getColor());
System.out.println(triangle.getBase());
System.out.println(triangle.getHight());

}
}
