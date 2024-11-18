class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    void shownum() {
        System.out.println("Hex: " + Integer.toHexString(number) + ", Octal: " + Integer.toOctalString(number));
    }
}

public class q42 {
    public static void main(String[] args) {
        new Num(100).shownum();
        new HexNum(100).shownum();
    }
}
