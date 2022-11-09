class Vehicle
{
     void run()
     {
         System.out.println("Vehicle is running");
     }
}
class OverrideBike extends Vehicle
{
     void run()
     {
           System.out.println("Bike is running safely");
     }

    public static void main(String[] args)
    {
         OverrideBike honda = new OverrideBike();
           honda.run();
    }
}