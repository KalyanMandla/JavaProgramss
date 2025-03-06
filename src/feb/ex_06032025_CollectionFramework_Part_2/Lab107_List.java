package feb.ex_06032025_CollectionFramework_Part_2;

import java.util.ArrayList;
import java.util.List;

public class Lab107_List {
    public static void main(String[] args) {
        Student s1 = new Student("Amit",1);
        Student s2 = new Student("Anil",2);
        Student s3 = new Student("Ram",3);
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(myStudents);


    }
}

class Student{
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
