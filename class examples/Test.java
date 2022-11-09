class Animal {
    int leg;
    String name;
}
class Test{
     public static void main(String[] args){
      Animal buzo = new Animal();
         buzo.leg = 4;
         buzo.name = "Dog"; 

     Animal zoom = new Animal();
         zoom.leg = 4;
         zoom.name = "Cat";
     
      System.out.println(buzo.leg+" "+buzo.name);   // 4 Dog
      System.out.println(zoom.leg+" "+zoom.name);    // 4 Cat
   }
}