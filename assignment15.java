class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Rahul", 20);

        // Object is automatically converted to String
        System.out.println(s);
    }
}
