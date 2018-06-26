package helloworld;

//Task 15 - PEOPLE
import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Person(String name, int age, String jobTitle) {

        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;

    }

    public Person() {
    }
    

    @Override
    public String toString() {
        return "Person: " + "name=" + name + ", age=" + age + ", jobTitle=" + jobTitle;
    }

    public void findPerson(ArrayList<Person> x, String who) {
        name = who;
        for (Person y : x) {

            if (who == y.name.toString()) {
                System.out.println(x.toString());

            }
        }
    }
}
