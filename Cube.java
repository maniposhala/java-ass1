package com.mani.shape;

public class Cube extends Shape {
	private int side;
	
	public void setSide(int side) {
		this.side = side;
	}

	
	public void Volume() {
		
		int volume = side*side*side;
		System.out.println("The Volume for the cube is: "+volume);
	}

	
	public void SurfaceArea() {
		
		int surface= 6*side*side;
		System.out.println("The Surface Area for the cube is: "+surface);
	
}
}