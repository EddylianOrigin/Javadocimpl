package com.company;
//import  statement


// javadoc is a tool for generating documentation from your source code
//a bunch of html files that together that create a website

//javadoc is like javac but for your comments

//how to run javadoc
//1. cmd line:
//2. IntelliJ IDEA IDE:

/**
 * PointTester tests the Point class in Point.java
 *
 * @author gsprint
 * @version 1.0
 * @see Point
 */

/**
 * pointTester tests the Point class in Point .java. This is a second sentence.
 */
public class PointTester {
    /**
     * this is the main() method for the driver program.
     *
     * @param args stores the incoming line arguments for the program.
     */
    public static void main(String[] args) {
        Point origin = new Point();
        System.out.println(origin);
    }
}
