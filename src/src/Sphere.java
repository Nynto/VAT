public class Sphere extends Form {

    private double radius;

    public Sphere(int id, double radius) {
        super(id);
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
