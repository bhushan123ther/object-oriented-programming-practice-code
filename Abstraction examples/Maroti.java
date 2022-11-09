// Abstraction example

abstract class Car
{
      abstract void run();      
} 
class Maroti extends Car
{
     void run()
     {
         System.out.println("Running safely..");
     }
     public static void main(String[] args)
     {
          Car obj = new Maroti();
           obj.run();
     }
}