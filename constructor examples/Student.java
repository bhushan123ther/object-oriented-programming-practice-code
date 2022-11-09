//Note : The default constructor is used to provide the default values of the object like 0, null 

class Student
{
    int age;
    String name;
 
    void display()
    {
         System.out.println(age+" "+name);
    }
    public static void main(String[] args)
    {
         Student s1 = new Student();
         Student s2 = new Student();

         s1.display();
         s2.display();
    }
}