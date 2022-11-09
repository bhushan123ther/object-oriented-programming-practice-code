// Acheivig multiple inheritance in java through interface

interface Printable
{  
     void print();  
}  
interface Showable
{  
      void print();  
}  
  
class TestInterface3 implements Printable, Showable
{  
     public void print()
     {
           System.out.println("Hello Multiple inheritance ");
     }  
    public static void main(String args[])
    {  
            TestInterface3 obj = new TestInterface3();  
            obj.print();  
    }    
}  