public class Enrolment {
    // Private attributes
    private Student student;
    private Course course;
    private String enrolmentDate;
    private String status;

    // Constructor
    public Enrolment(Student student, Course course, String enrolmentDate) {
        this.student = student;
        this.course = course;
        this.enrolmentDate = enrolmentDate;

        // Attempt to enrol the student
        boolean enrolled = course.addStudent(student);

        if (enrolled) {
            this.status = "Enrolled";
        } else {
            this.status = "Waitlisted";
        }
    }

    // Getter and setter methods
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public String getStatus() {
        return status;
    }

    // Method to display enrolment details
    public void displayEnrolmentDetails() {
        System.out.println("Student: " + student.getName() + " (" + student.getStudentId() + ")");
        System.out.println("Course: " + course.getCourseCode() + " - " + course.getCourseName());
        System.out.println("Enrolment Date: " + enrolmentDate);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}