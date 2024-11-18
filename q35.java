public class q35 {
    String name;
    int age;

    public q35() { name = "Unknown"; age = 0; }
    public q35(String n) { name = n; age = 0; }
    public q35(String n, int a) { name = n; age = a; }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new q35().display();
        new q35("Alice").display();
        new q35("Bob", 30).display();
    }
}
