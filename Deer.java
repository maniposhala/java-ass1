package com.mani.animals;

public class Deer {
	
	private String color = "Golden";
	private int age = 20;
	private double weight = 82.25;
	public boolean isVegetarian() {
		boolean vegetarian=true;
		return vegetarian;
	}
	public boolean canClimb() {
		boolean climb=false;
		return climb;
	}
	public String Sound() {
		String sound="Deer Snarl";
		return sound;
	}
	public void displayDeer() {
		System.out.println("color: "+color+" age: "+age+" weight: "+weight);
		System.out.println("isvegetarian: "+isVegetarian());
		System.out.println("canClimb: "+canClimb());
		System.out.println("Sound: "+Sound());
		
	}

}



