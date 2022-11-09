class Student{
     int rollno;
     String name;
     int age;

     void insertRecords(int rn, String nm, int ag){
        rollno = rn;
        name = nm;
        age = ag;
    }
    void displayInfo(){
       System.out.println(rollno+" "+name+" "+age);
   }
}

class Test1
{
      public static void main(String[] args)
      {
            Student s1 = new Student();
            Student s2 = new Student();
           
            s1.insertRecords(101,"Bhushan Ther",23);
            s2.insertRecords(102,"Ravi shastry",24);

           s1.displayInfo();
           s2.displayInfo();
      }
}