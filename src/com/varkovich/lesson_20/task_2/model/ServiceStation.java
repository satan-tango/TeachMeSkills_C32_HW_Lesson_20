package com.varkovich.lesson_20.task_2.model;

import com.varkovich.lesson_20.task_2.constants.Constants;

public class ServiceStation {
    private int vehiclesAmount = 7;

    public ServiceStation() {
    }

    public int getVehiclesAmount() {
        return vehiclesAmount;
    }

    public synchronized void addVehicles() {
        while (vehiclesAmount >= Constants.MAX_AMOUNT_OF_VEHICLES_AT_SERVICE_STATION) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        vehiclesAmount++;
        System.out.println("Vehicles has been added");
        System.out.println("Vehicles at service station -> " + vehiclesAmount + "\n");

        notify();
    }

    public synchronized void pickUpVehicles() {
        while (vehiclesAmount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        vehiclesAmount--;
        System.out.println("Vehicles has been picked up");
        System.out.println("Vehicles at service station -> " + vehiclesAmount + "\n");

        notify();
    }
}
