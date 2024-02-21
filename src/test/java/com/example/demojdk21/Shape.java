package com.example.demojdk21;

// The permits clause has been omitted
// as its permitted classes have been
// defined in the same file.
public sealed abstract class Shape //permits Circle, Rectangle 
 {

  public abstract double area();

}

final class Circle extends Shape {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

}

final class Rectangle extends Shape {

  private final double length;
  private final double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

}
