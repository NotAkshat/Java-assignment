class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        System.out.println("Time to travel " + miles + " miles at 60 mph: " + miles / 60 + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double miles) {
        super(miles);
    }

    void travelTime() {
        System.out.println("Time to travel " + miles * 1.60934 + " km at 100 km/s: " + (miles * 1.60934) / 100 + " seconds");
    }
}

public class q43 {
    public static void main(String[] args) {
        new Distance(120).travelTime();
        new DistanceMKS(120).travelTime();
    }
}
