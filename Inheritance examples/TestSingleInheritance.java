// Single Inheritance example
class Animal
{
       void eat()
       {
            System.out.println("Eating..");
       }
}
class Dog extends Animal
{
     void bark()
     {
          System.out.println("Barking..");
     }
}
class TestSingleInheritance
{
     public static void main(String[] args)
     {
           Dog d = new Dog();
              d.eat();
              d.bark();
     }
}