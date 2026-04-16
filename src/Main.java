import java.util.ArrayList;

// Main program to test the student enrolment system
public class Main {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("S1001", "Aman Singh", "aman.singh@student.edu");
        Student student2 = new Student("S1002", "Priya Sharma", "priya.sharma@student.edu");
        Student student3 = new Student("S1003", "Rahul Verma", "rahul.verma@student.edu");

        // Creating course objects
        Course course1 = new Course("ITS206", "Software Construction and Design", 2);
        Course course2 = new Course("ITS105", "Introduction to Programming", 2);

        // List to store enrolment records
        ArrayList<Enrolment> enrolments = new ArrayList<>();

        // Creating enrolments
        Enrolment enrolment1 = new Enrolment(student1, course1, "2026-04-16");
        Enrolment enrolment2 = new Enrolment(student2, course1, "2026-04-16");
        Enrolment enrolment3 = new Enrolment(student3, course1, "2026-04-16");
        Enrolment enrolment4 = new Enrolment(student1, course2, "2026-04-16");
        Enrolment enrolment5 = new Enrolment(student2, course2, "2026-04-16");

        enrolments.add(enrolment1);
        enrolments.add(enrolment2);
        enrolments.add(enrolment3);
        enrolments.add(enrolment4);
        enrolments.add(enrolment5);

        System.out.println("==================================");
        System.out.println("      STUDENT ENROLMENT SYSTEM");
        System.out.println("==================================");

        System.out.println("\nENROLMENT PROCESS");
        System.out.println("----------------------------------");
        enrolment1.displayEnrolmentMessage();
        enrolment2.displayEnrolmentMessage();
        enrolment3.displayEnrolmentMessage();
        enrolment4.displayEnrolmentMessage();
        enrolment5.displayEnrolmentMessage();

        // Display student information
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("----------------------------------");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();

        // Display course details
        System.out.println("\nCOURSE DETAILS");
        System.out.println("----------------------------------");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Display enrolment details
        System.out.println("\nENROLMENT DETAILS");
        System.out.println("----------------------------------");
        for (Enrolment enrolment : enrolments) {
            enrolment.displayEnrolmentDetails();
        }

        // Display waitlist details
        System.out.println("WAITLIST DETAILS");
        System.out.println("----------------------------------");
        course1.displayWaitlist();
        System.out.println();
        course2.displayWaitlist();

        System.out.println("\nProgram finished successfully.");
    }
}