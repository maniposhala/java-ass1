package com.mani.vehicle;

public class Road {

	public static void main(String[] args) {
		Truck truck = new Truck("blue",8,"hh");
		truck.showDetails();
		Bus bus=new Bus("white",2,"mn");
		bus.showDetails();
		Car car=new Car("black",5,"tt");
		car.showDetails();

	}

}


