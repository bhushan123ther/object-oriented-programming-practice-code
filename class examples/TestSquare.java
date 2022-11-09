class Square
{
     float radius;

    void insertVal(float r)
    {
        radius = r;     
    }
   void calculateArea()
   {
        System.out.println("The area of square is : "+3.14 * radius * radius);
   }
}
class TestSquare
{
     public static void main(String[] args)
     {
          Square sq1 = new Square();
            sq1.insertVal(4);
            sq1.calculateArea();
     }
}