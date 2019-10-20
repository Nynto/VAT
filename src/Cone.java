public class Cone extends Form {

    private double radius;
    private double height;

    public Cone(int id, double radius, double height) {
        super(id, "Cone");
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

    @Override
    public String toString() {
        return name + " (" + id + ") volume: " + calculateVolume();
    }
}