package helloworld;

//Task 15 - PEOPLE
public class Person {
    
    String name;
    int age;
    String jobTitle;
    
    public Person (String a, int b, String c) {
        
        name = a;
        age = b;
        jobTitle = c;
        
        System.out.println(name + " " + age + " " + jobTitle);
        
    }
    
}
