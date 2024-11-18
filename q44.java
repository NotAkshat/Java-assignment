class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal is sleeping");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class q44 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
