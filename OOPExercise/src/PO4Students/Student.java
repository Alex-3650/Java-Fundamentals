package PO4Students;

public class Student {
    String firstName;
    String lastName;
    double grade;

    /////////////////////////////////////////////////////////
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //////////////////////////////////////////////////////


    public Student(String lastName, double grade, String firstName) {
        this.lastName = lastName;
        this.grade = grade;
        this.firstName = firstName;
    }
}
