package com.chapter07_object_array.init;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car (String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void dirveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed + "km/h로 달려갑니다.");
    }
}
