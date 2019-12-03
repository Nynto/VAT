package vat;

public class Block extends Form {

    public Block(double length, double width, double height) {
        this.name = "Block (L: " + length + " W: " + width + " H: " + height + ")";
        this.type = "block";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}