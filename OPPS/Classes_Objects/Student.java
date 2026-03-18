package OPPS.Classes_Objects;

public class Student {

    String name;
    int age;
    String grade;

    Student(String n,int a,String g){
        name = n;
        age = a;
        grade = g;
    }

    void introduce(){
        System.out.println("Hi , I am "+name+",I am "+age+" years old");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vishal",23,"A+");
        s1.introduce();
        Student s2 = new Student("Shubham",22,"A");
        s2.introduce();
    }
}
