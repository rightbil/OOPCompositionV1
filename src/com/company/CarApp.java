package com.company;

public class CarApp {

    public static void main(String[] args) {
	Car car = new Car();
	car.setModel("Porche");
	car.setMake("red");
	car.setSpeed(80);
        System.out.println(car.start());
        System.out.println(car.accelerate());
	    car.getSpeed();
        System.out.println(car.stop());
    }
}
