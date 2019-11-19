public class Block extends Form {

    public Block(double length, double width, double height) {
        this.name = "Block " + length + " " + width + " " + height;
        this.type = "block";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}