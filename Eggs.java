package com.mani.eggs;

public class Eggs {
private int number,gross,dozen,left;

public void setNumber(int number) {
	this.number = number;
}

public int calculateGross() {
	gross=number/144;
	return gross;
}
public int calculateDozen() {
	number=number-(gross*144);
	dozen=number/12;
	return dozen;
}
public int calculateLeft() {
	left=number-(dozen*12);
	return left;
}
public void displayEggs() {
	System.out.println("Gross: "+gross+" Dozen:"+dozen+" Leftover: "+left);
}

}

