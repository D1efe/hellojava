package helloworld;

//Task 15 - PEOPLE
public class Person {

    private String name;
    private int age;
    private String jobTitle;

    public Person(String name, int age, String jobTitle) {

        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;

    }

    @Override
    public String toString() {
        return "Person: " + "name=" + name + ", age=" + age + ", jobTitle=" + jobTitle;
    }

}
