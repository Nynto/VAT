public class Pyramid extends Form {
    private double length;
    private double width;
    private double height;

    public Pyramid(int id, double length, double width, double height) {
        super(id);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return (this.length * this.width * this.height) / 3;
    }
}