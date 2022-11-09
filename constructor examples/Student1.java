// Parameterized constructor

class Student1
{
    int age;
    String name;
    Student1(int ag , String nm)
    {
        age = ag;
        name = nm;
    }
    void display()
    {
         System.out.println(age+" "+name);
    }
    public static void main(String[] args)
    {
         Student1 s1 = new Student1(23,"Bhusha The");
         Student1 s2 = new Student1(24,"Ronny Sharma");

         s1.display();
         s2.display();
    }
}