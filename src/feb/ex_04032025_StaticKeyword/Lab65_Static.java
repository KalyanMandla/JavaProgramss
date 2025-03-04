package feb.ex_04032025_StaticKeyword;

public class Lab65_Static {
    public static void main(String[] args) {
        Student s1 = new Student(25);
        Student s2 = new Student(28);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);


    }
}

class Student{
    int age; // Instance variable (Non static)
    static String school_name = "ABC";// static variable

    {
        System.out.println("IIB"); // Instance Initialisation Block
        System.out.println("Here you can write a code what you want to do when object is created");
        System.out.println("Read a MySQL db()");

    }

    static {
        System.out.println("SIB"); // Static Initialisation Block
        System.out.println("Loaded Once, When Class is Loaded");
    }

    public Student(int age) {
        this.age = age;
    }
}
