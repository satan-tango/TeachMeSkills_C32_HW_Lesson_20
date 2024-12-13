package com.varkovich.lesson_20.task_2.model;

public class VehiclesAdder implements Runnable {
    Thread thread;

    ServiceStation serviceStation;

    public VehiclesAdder(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        addVehiclesAtServiceStation();
    }

    private void addVehiclesAtServiceStation() {
        for (int i = 0; i < 10; i++) {
            serviceStation.addVehicles();
        }
    }
}
