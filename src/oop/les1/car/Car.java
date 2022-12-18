package oop.les1.car;

public class Car {
    private String carNumber;
    private int carSpeed;
    private int maxSpeed = 300;

    public String getCarNumber() {
        return carNumber;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setCarNumber(String carNumber) {
        if (!carNumber.trim().equals("")) this.carNumber = carNumber;
    }

    //increase speed. Suppose that max speed of cars is 300 km/h
    public void increaseSpeed() {
        if (carSpeed < maxSpeed) {
            carSpeed++;
        }
    }

    //slow down speed
    public void slowSpeed() {
        if (carSpeed > 0) {
            carSpeed--;
        }
    }

    //stop car
    public void stopCar() {
        carSpeed = 0;
    }

    //info of car
    public String toString() {
        return "Car number " + carNumber + " has speed " + carSpeed + " km/h";
    }
}
