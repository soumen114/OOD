abstract class Shape
{
  abstract double calculateArea();
}

class Circle extends Shape
{
   double radius;

   public Circle(double radius)
   {
     this.radius = radius;
   }

   double calculateArea()
   {
     return 3.14*radius*radius;
   }
}

class Rectangle extends Shape
{
  double length;
  double width;
  
  public Rectangle(double length , double width)
  {
    this.length = length;
    this.width = width;
  }
  
  double calculateArea()
  {
    return length*width;
  }
}

public class ShapeAreaCalculator6
{
  public static void main(String[] args)
  {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0 , 6.0);
    
    System.out.println("Area of the Circle : " + circle.calculateArea());
    System.out.println("Area of the Rectangle : " + rectangle.calculateArea());
  }
}