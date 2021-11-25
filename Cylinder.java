package com.mani.shape;

public class Cylinder {
	private int radius,height;

public void setRadius(int radius) {
	this.radius = radius;
}

public void setHeight(int height) {
	this.height = height;
}


public void Volume() {
	double volume=3.124*radius*radius*height;
	System.out.println("The Volume for the cylinder is: "+volume);

}

public void SurfaceArea() {
	double surface= 2*3.124*radius*(radius+height);
	System.out.println("The Surface Area for the cylinder is: "+surface);

}

}


