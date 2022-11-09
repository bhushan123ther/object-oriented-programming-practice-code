// Real world example of method overriding

class Bank
{
     int getRateOfInterest()
     {
         return 0;
     }
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
         return 8;
    }
}
class ICICI extends Bank
{
    int getRateOfInterest()
    {
          return 7;
    }
}
class AXIS extends Bank
{
     int getRateOfInterest()
     {
           return 9;
     }
}
class Test
{
  public static void main(String[] args)
  {
    SBI s1 = new SBI();
    ICICI i1 = new ICICI();
    AXIS a1 = new AXIS();

   System.out.println("SBI Rate of Interest : "+s1.getRateOfInterest());
   System.out.println("ICICI Rate of Interest : "+i1.getRateOfInterest());
   System.out.println("AXIS Rate of Interest : "+a1.getRateOfInterest());
  }
}