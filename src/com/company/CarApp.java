package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        ArrayList<Car> cars= new ArrayList<>();
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model ");
        String make=sc.next();
        car.setMake(make);

        System.out.println("Enter year");
        int year=sc.nextInt();
        car.setYear(year);
        System.out.println("Enter make");
        String model=sc.next();
        car.setModel(model);
        System.out.println("Enter speed");
        int speed=sc.nextInt();
        car.setSpeed(speed);


//        car.setModel("Porche");
//        car.setMake("red");
//        car.setSpeed(80);
        cars.add(car);
        for(Car c : cars) {
            System.out.println(car.start());
            System.out.println(car.accelerate());
            System.out.println(car.stop());
            car.load();
            car.getSpeed();
        }

    }
}
