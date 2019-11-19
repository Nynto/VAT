public class Cylinder extends Form {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.name = "Cylinder " + radius + " " + height;
        this.type = "cylinder";
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}