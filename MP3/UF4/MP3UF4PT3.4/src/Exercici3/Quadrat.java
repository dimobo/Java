/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici3;

import java.awt.Point;

/**
 *
 * @author dimobo
 */
public class Quadrat implements java.lang.Comparable {
    public int costat = 0;
    public Point origin;

    // four constructors
    public Quadrat() {
        origin = new Point(0, 0);
    }
    public Quadrat(Point p) {
        origin = p;
    }
    public Quadrat(int c) {
        origin = new Point(0, 0);
        costat = c;
    }
    public Quadrat(Point p, int c) {
        origin = p;
        costat = c;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return costat * costat;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}