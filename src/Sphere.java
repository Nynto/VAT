public class Sphere extends Form {

    private double radius;

    public Sphere(int id, double radius) {
        super(id, "Sphere");
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

    @Override
    public String toString() {
        return name + " (" + id + ") volume: " + calculateVolume();
    }
}
