package vat;

public class Sphere extends Form {

    public Sphere(double radius) {
        this.name = "Sphere (R: " + radius + ")";
        this.type = "sphere";
        this.radius = radius;
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 3)) * 4 / 3;
    }
}
