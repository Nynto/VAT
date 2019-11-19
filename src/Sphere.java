public class Sphere extends Form {

    private double radius;

    public Sphere(double radius) {
        this.name = "Sphere " + radius;
        this.type = "sphere";
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 3)) * 4 / 3;
    }
}
