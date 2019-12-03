package vat;

import java.io.Serializable;

public abstract class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String name;
    protected String type;
    protected double length;
    protected double width;
    protected double height;
    protected double radius;

    abstract public double calculateVolume();

    public String getType() {
        return type;
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

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return name + " volume: " + (double) Math.round(calculateVolume() * 100) / 100;
    }
}