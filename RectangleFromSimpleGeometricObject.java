/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.simplegeometricobject;

/**
 *
 * @author sujon
 */
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {

    /**
     * @param args the command line arguments
     */
   private double width;
   private double height;

   public RectangleFromSimpleGeometricObject() {
   }

   public RectangleFromSimpleGeometricObject(
   double width, double height) {
    this.width = width;
    this.height = height;
    }

   public RectangleFromSimpleGeometricObject(
   double width, double height, String color, boolean filled) {
    this.width = width;
   this.height = height;
    setColor(color);
    setFilled(filled);
    }

   /** Return width */
    public double getWidth() {
    return width;
   }

    /** Set a new width */
   public void setWidth(double width) {
   this.width = width;
   }

    /** Return height */
   public double getHeight() {
       return height;
    }

   /** Set a new height */
    public void setHeight(double height) {
   this.height = height;
   }
    public double getArea() {
    return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
   return 2 * (width + height);
    }
}
