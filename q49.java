interface A {
    void methodA();
    void methodB();
}

interface B {
    void methodC();
    void methodD();
}

interface C {
    void methodE();
    void methodF();
}

interface D extends A, B, C {
    void methodG();
}

class Implementation implements D {
    public void methodA() { System.out.println("Method A"); }
    public void methodB() { System.out.println("Method B"); }
    public void methodC() { System.out.println("Method C"); }
    public void methodD() { System.out.println("Method D"); }
    public void methodE() { System.out.println("Method E"); }
    public void methodF() { System.out.println("Method F"); }
    public void methodG() { System.out.println("Method G"); }
}

public class q49 {
    public static void main(String[] args) {
        Implementation obj = new Implementation();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
        obj.methodF();
        obj.methodG();
    }
}
