package intermediate.dayTwo;
/**
 * 
 * Create a class called Person that represents a person, with properties for their 
 * name and age. The Person class should have a constructor that takes two parameters: 
 * a String for the person's name and an int for their age. 
 * The constructor should set the initial values of the name and age properties based 
 * on the passed-in values.
 * Once you have created the Person class and its constructor, 
 * create two Person objects: one representing a person named "Alice" who is 25 years old, 
 * and another representing a person named "Bob" who is 30 years old. 
 * Then print out the name and age properties of each Person object.
 * 
 */
public class Person {

    private int age;
    private String name;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }


    


    public static void main(String... args) {

        Person alice = new Person("Alice", 25);
        Person bob =   new Person("Bob", 30);
        System.out.println(alice.getName() + " is " + alice.getAge() + " years old");
        System.out.println(bob.getName() + " is " + bob.getAge() + " years old");

    }




    

    
    
}
