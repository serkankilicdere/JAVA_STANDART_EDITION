package InheritanceAndOverriding;

public class Person {
private String name;
private int age;

Person(String name, int age) {
    this.name = name;
    this.age = age;
}



    public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

}

class Teacher extends Person {
    private String role = "Teacher";

    Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}

class Student extends Person {
    Student(String name, int age) {
        super(name, age);

    }

   private String role="Student";

    @Override
    public void displayInfo() {
       super.displayInfo();
        System.out.println("Role: " + role);
    }
}