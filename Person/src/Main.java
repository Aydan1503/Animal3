// Abstract class Person
abstract class Person {
    private String name;
    private int age;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Getter and Setter methods
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }




    abstract void displayInfo();
}


// Subclass Student
class Student extends Person {
    private int studentId;


    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }


    // Override the displayInfo() method
    @Override
    void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
    }
}


// Subclass Teacher
class Teacher extends Person {
    private String subjectTaught;


    // Constructor
    public Teacher(String name, int age, String subjectTaught) {
        super(name, age);
        this.subjectTaught = subjectTaught;
    }


    // Override the displayInfo() method
    @Override
    void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject Taught: " + subjectTaught);
    }
}


public class Main {
    public static void main(String[] args) {


        Person student = new Student("Aydan Aliyeva", 29, 3042803);
        student.displayInfo();




        Person teacher = new Teacher("Leyla Aliyeva", 40, "History");
        teacher.displayInfo();
    }
}
