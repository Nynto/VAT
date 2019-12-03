public class Cylinder extends Form {

    public Cylinder(double radius, double height) {
        this.name = "Cylinder (R: " + radius + " H: " + height + ")";
        this.type = "cylinder";
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}