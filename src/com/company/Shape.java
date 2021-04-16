package com.company;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        System.out.println("Shape unknow! Cannot perform operation!");
        return 0;
    }
}
