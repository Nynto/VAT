public class Sphere extends Form {

    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(this.radius, 3)) * 4 / 3;
    }
}
