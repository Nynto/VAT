package vat;

public class Pyramid extends Form {

    public Pyramid(double length, double width, double height) {
        this.name = "Pyramid (L: " + length + " W: " + width + " H: " + height + ")";
        this.type = "pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return (length * width * height) / 3;
    }
}