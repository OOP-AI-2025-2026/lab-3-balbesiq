package org.example.task2;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 1;
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public double surfaceArea(){
        return (2*length*height+2*length*width+2*width*height);
    }

    public double lateralSurfaceArea(){
        return (2*length*height+2*width*height);
    }

    public double volume(){
        return (length*width*height);
    }
}
