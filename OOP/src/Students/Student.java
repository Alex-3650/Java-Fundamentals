package Students;

public class Student {

    private String firstName;
    private String secondName;
    private int age;
    private String homeTown;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getSecondName() {
        return secondName;
    }

    public Student(int age, String firstName, String secondName, String homeTown) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.homeTown=homeTown;
    }
}
