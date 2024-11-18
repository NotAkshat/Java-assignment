public class q32 {
    String name;
    int age;

    public pc(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        pc person = new pc("Alice", 25);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
