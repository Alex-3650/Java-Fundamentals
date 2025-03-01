package PO6OrdeRbyAge;

public class Person {
    String name;
    String id;
    int age;


    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
}
