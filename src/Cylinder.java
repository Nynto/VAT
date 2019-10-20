public class Cylinder extends Form {

    private double radius;
    private double height;

    public Cylinder(int id, double radius, double height) {
        super(id);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}