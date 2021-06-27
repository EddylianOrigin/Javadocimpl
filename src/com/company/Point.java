package com.company;

/**
 * The Point class represents a point in 2D space
 *
 * @author gsprint
 * @version 1.0
 */
public class Point {
    /**
     * x represents the x coordinate of a (x,y) coordinate for 2d space. This is a second sentence.
     */
    private int x;
    private int y;

    /**
     * Explicit value constructor for Point. Accepts whats needed for 2D space (2 <code>int</code>)
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
