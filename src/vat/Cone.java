package vat;

public class Cone extends Form {

    public Cone(double radius, double height) {
        this.name = "Cone (R: " + radius + " H: " + height + ")";
        this.type = "cone";
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}