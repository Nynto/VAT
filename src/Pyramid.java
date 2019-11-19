public class Pyramid extends Form {

    private double length;
    private double width;
    private double height;

    public Pyramid(double length, double width, double height) {
        this.name = "Pyramid " + length + " " + width + " " + height;
        this.type = "pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return (length * width * height) / 3;
    }
}