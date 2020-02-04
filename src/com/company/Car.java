package com.company;

public final class Car extends Vehicle{
    private String make;
    private int year;
    private String model;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
        System.out.println("The " + this.getMake() +" " + this.getModel()+ " is going " +getSpeed() +" mph");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

   public void load(){
       System.out.println("Car can load ...");

    }


    @Override
    public String start() {
        return "The " +  this.getMake() + " " + this.getModel()+" is starting";
    }

    @Override
    public String accelerate() {
        return "The " + this.getMake() +" " + this.getModel()+ " is accelerating";
    }

    @Override
    public String stop() {
        return "The " + this.getMake() +" " + this.getModel()+ " is stopped";
    }
}
