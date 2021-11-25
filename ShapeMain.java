package com.mani.shape;

public class ShapeMain {
	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder();
		cylinder.setRadius(12);
		cylinder.setHeight(4);
		cylinder.Volume();
		cylinder.SurfaceArea();
		
		Cube cube=new Cube();
		cube.setSide(4);
		cube.Volume();
		cube.SurfaceArea();
		
		Sphere sphere=new Sphere();
		sphere.setRadius(2);
		sphere.Volume();
		sphere.SurfaceArea();

	}

}

