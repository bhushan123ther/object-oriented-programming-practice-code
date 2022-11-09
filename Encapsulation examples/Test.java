class Student{
   private String name;   // private data member

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
}
class Test {
     public static void main(String[] args){
        Student s1 = new Student();
 
        s1.setName("Bhushan Ther");
        System.out.println(s1.getName());
     }
}