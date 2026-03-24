class Demo {
    private int age;
    private String Name;

    // get and set age
    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    // get and set name
    public void setName(String n) {
        this.Name = n;

    }

    public String getName() {
        return Name;
    }

}

public class Human {

    public static void main(String[] args) {
        Demo d = new Demo();
        // set name and age
        d.setAge(23);
        d.setName("Vishal");

        // get name and age
        System.out.println("Name : " + d.getName() + " Age : " + d.getAge());

    }
}
