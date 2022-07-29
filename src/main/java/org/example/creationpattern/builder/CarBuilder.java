package org.example.creationpattern.builder;

public class CarBuilder {
    private final Car newCar;

    public CarBuilder(){
        this.newCar = new Car();
    }

    public CarBuilder initName(String name){
        newCar.setName(name);
        return this;
    }
    public CarBuilder initType(String type){
        newCar.setType(type);
        return this;
    }
    public CarBuilder initWeight(String weight){
        newCar.setWeight(weight);
        return this;
    }
    public CarBuilder initNumber(int number){
        newCar.setNumber(number);
        return this;
    }

    public Car build(){
        return newCar;
    }

}
