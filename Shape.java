package com.mani.rectangle;

public class Shape {
	public void area(int length,int breadth) {
		int area = length*breadth;
		System.out.println("Area of a rectangle: "+area);
	}
	public void area(int side) {
		int area = side*side;
		System.out.println("Area of a square: "+area);
	}
	public void perimeter(int length,int breadth) {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of a rectangle: "+perimeter);
	}
	public void perimeter(int side) {
		int perimeter = 4*side;
		System.out.println("Perimeter of a square: "+perimeter);
	}
}



