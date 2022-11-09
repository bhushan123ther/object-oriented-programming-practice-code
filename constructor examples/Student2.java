// constructor overloading

class Student2
{
    int id;
    String name;
    int age;

    Student2(int i, String nm)
    {
         id = i; 
         name = nm;
    }

    Student2(int i , String nm , int ag)
    {
         id = i;
         name = nm;
         age = ag;
    }

    void display()
    {
         System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args)
    {
         Student2 s1 = new Student2(101,"Rutuja");
         Student2 s2 = new Student2(201,"Pratik",24);

        s1.display();
        s2.display();
    }
}