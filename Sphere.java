package com.mani.shape;

public class Sphere {
	private int radius;

public void setRadius(int radius) {
	this.radius = radius;
}


public void Volume() {
	double volume=1.34*3.124*radius*radius;
	System.out.println("The Volume for the sphere is: "+volume);
}


public void SurfaceArea() {
	double surface= 4*3.124*radius*(radius);
	System.out.println("The Surface Area for the sphere is: "+surface);
}

}


