package com.varkovich.lesson_20.task_2.model;

public class VehiclesPicker implements Runnable {
    Thread thread;

    ServiceStation serviceStation;

    public VehiclesPicker(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        pickUpVehiclesAtServiceStation();
    }

    private void pickUpVehiclesAtServiceStation() {
        for (int i = 0; i < 10; i++) {
            serviceStation.pickUpVehicles();
        }
    }
}
