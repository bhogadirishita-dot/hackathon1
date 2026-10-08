  public class Main {
    public static void main(String[] args) {
        // All student details are hardcoded directly here
        String name = "John Doe";
        int roll = 101;
        double marks = 88.5;
        String course = "Java Programming";
        int credits = 4;

        // Creating Student object using the parameterized constructor
        Student student = new Student(name, roll, marks, course, credits);

        // Checking eligibility and executing methods
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("Student is not eligible for registration.");
        }
    }
}

class Student {
    private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    // Parameterized constructor
    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        return courseCredits * 1500.0;
    }

    public boolean checkEligibility() {
        return marks >= 50;
    }

    public double calculateScholarship() {
        double totalFee = calculateFee();
        if (marks >= 85) {
            return 0.20 * totalFee;
        } else if (marks >= 70 && marks <= 84) {
            return 0.10 * totalFee;
        } else {
            return 0.0;
        }
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks Obtained: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Total Course Fee: Rs. " + calculateFee());
        System.out.println("Scholarship Offered: Rs. " + calculateScholarship());
        System.out.println("Final Fee to Pay: Rs. " + calculateFinalFee());
    }
}
