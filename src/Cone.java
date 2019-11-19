public class Cone extends Form {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.name = "Cone " + radius + " " + height;
        this.type = "cone";
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
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}