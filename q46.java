class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class q46 {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();
    }
}
