package main;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public double getArea() {
		double p = this.getPerimeter() / 2;
		return Math.pow(p * (p - this.side1) * (p - this.side2) * (p - this.side3), 0.5);
	}

	public String toString() {
		return "The Triangle class takes in 3 sides and calculate the permiter and are of the triangle.";
	}
}
