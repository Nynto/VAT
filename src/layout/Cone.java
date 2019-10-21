package layout;

public class Cone extends layout.Form {

    public static Object calculateVolume;
    private double radius;
    private double height;

    public Cone(String name, double radius, double height) {
        super(name);
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
        return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3;
    }
}