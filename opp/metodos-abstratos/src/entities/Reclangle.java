package entities;

import entities.enums.Color;

public class Reclangle extends  Shape{

    private Double width;
    private Double height;

    public Reclangle() {}

    public Reclangle(Color color, Double x, Double y) {
        super(color);
        setWidth(x);
        setHeight(y);
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return getWidth()*getHeight();
    }
}
