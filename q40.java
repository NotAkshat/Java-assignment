import java.util.Scanner;

class ThreeDObject {
    double surfaceArea() { return 0; }
    double volume() { return 0; }
}

class Box extends ThreeDObject {
    Box(double l, double w, double h) { surfaceArea = 2 * (l * w + w * h + h * l); volume = l * w * h; }
}

class Cylinder extends ThreeDObject {
    Cylinder(double r, double h) { surfaceArea = 2 * Math.PI * r * (r + h); volume = Math.PI * r * r * h; }
}

class Cone extends ThreeDObject {
    Cone(double r, double h) { surfaceArea = Math.PI * r * (r + Math.sqrt(r * r + h * h)); volume = (1.0/3) * Math.PI * r * r * h; }
}

public class q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());

        System.out.println("Box Surface Area: " + box.surfaceArea() + ", Volume: " + box.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea() + ", Volume: " + cylinder.volume());
        System.out.println("Cone Surface Area: " + cone.surfaceArea() + ", Volume: " + cone.volume());
        sc.close();
    }
}
