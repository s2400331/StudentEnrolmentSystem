import java.util.ArrayList;

// Class to store course details and manage enrolment capacity
public class Course {
    // Private attributes
    private String courseCode;
    private String courseName;
    private int maximumCapacity;

    // Lists to store enrolled students and waitlisted students
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> waitlistedStudents;

    // Constructor
    public Course(String courseCode, String courseName, int maximumCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maximumCapacity = maximumCapacity;
        this.enrolledStudents = new ArrayList<>();
        this.waitlistedStudents = new ArrayList<>();
    }

    // Getter and setter methods
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<Student> getWaitlistedStudents() {
        return waitlistedStudents;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Maximum Capacity: " + maximumCapacity);
        System.out.println("Currently Enrolled: " + enrolledStudents.size());
        System.out.println("Students on Waitlist: " + waitlistedStudents.size());
    }

    // Method to add student to course or waitlist
    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < maximumCapacity) {
            enrolledStudents.add(student);
            return true;
        } else {
            waitlistedStudents.add(student);
            return false;
        }
    }

    // Method to display waitlist
    public void displayWaitlist() {
        System.out.println("Waitlist for " + courseCode + " - " + courseName + ":");
        if (waitlistedStudents.isEmpty()) {
            System.out.println("No students on the waitlist.");
        } else {
            for (Student student : waitlistedStudents) {
                System.out.println("- " + student.getStudentId() + " | " + student.getName());
            }
        }
    }
}