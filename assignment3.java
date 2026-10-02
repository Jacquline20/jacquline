import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Grade: A");
        }

        if (marks >= 70) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        sc.close();
    }
}

