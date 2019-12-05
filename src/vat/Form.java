package vat;

import java.io.Serializable;

public abstract class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    String name;
    String type;
    double length;
    double width;
    double height;
    double radius;

    public abstract double calculateVolume();

    String getType() {
        return type;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return name + " volume: " + (double) Math.round(calculateVolume() * 100) / 100;
    }
}