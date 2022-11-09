abstract class Shape
{
      abstract void draw();
}
class Circle extends Shape
{
      void draw()
      {
           System.out.println("Drawing circle..");
      }
}
class Rectangle extends Shape
{
      void draw()
      {
           System.out.println("Drawing rectangle..");
      }
}
class TestAbstraction
{
     public static void main(String[] args)
     {
            Shape s = new Rectangle();
              s.draw();
     }
}