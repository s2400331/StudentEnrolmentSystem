import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S101", "Alice Brown", "alice@example.com");
        Student student2 = new Student("S102", "Bob Smith", "bob@example.com");
        Student student3 = new Student("S103", "Charlie Lee", "charlie@example.com");

        // Create courses
        Course course1 = new Course("ITS206", "Software Construction and Design", 2);
        Course course2 = new Course("ITS105", "Introduction to Programming", 2);

        // Store enrolments
        ArrayList<Enrolment> enrolments = new ArrayList<>();

        // Enrol students in courses
        enrolments.add(new Enrolment(student1, course1, "2026-04-16"));
        enrolments.add(new Enrolment(student2, course1, "2026-04-16"));
        enrolments.add(new Enrolment(student3, course1, "2026-04-16"));

        enrolments.add(new Enrolment(student1, course2, "2026-04-16"));
        enrolments.add(new Enrolment(student2, course2, "2026-04-16"));

        // Display student information
        System.out.println("===== STUDENT INFORMATION =====");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();

        // Display course details
        System.out.println("\n===== COURSE DETAILS =====");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Display enrolment details
        System.out.println("\n===== ENROLMENT DETAILS =====");
        for (Enrolment enrolment : enrolments) {
            enrolment.displayEnrolmentDetails();
        }

        // Display waitlist details
        System.out.println("===== WAITLIST DETAILS =====");
        course1.displayWaitlist();
        System.out.println();
        course2.displayWaitlist();
    }
}