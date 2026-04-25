package Java8.MethodReferences.cons;

public class Consmain {
    public static void main(String[] args) {


        System.out.println("Learning constructor Reference");
        //Refer the method in Student using without constructor reference
        System.out.println("\nRefer without constructor reference");
        Provider provider = () ->{
            return new Student();
        };

        Student student = provider.getStudent();
        student.display();

        // With constructor reference
        //ClassName :: new
        System.out.println("\nWith constructor reference");
        Provider provider1 = Student::new;
        Student student1 = provider1.getStudent();
        student1.display();

    }
}
