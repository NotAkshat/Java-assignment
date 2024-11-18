class Parent {
    static void display() {
        System.out.println("Parent class static method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child class static method");
    }
}

public class q39 {
    public static void main(String[] args) {
        Parent.display();
        Child.display();
    }
}
