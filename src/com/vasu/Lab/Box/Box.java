package com.vasu.Lab.Box;

public class Box {
    double len;
    double width;
    double height;

    public Box(double len, double width, double height) {
        this.len = len;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return len*width*height;
    }

}