package com.varkovich.lesson_20.task_2;

import com.varkovich.lesson_20.task_2.model.ServiceStation;
import com.varkovich.lesson_20.task_2.model.VehiclesAdder;
import com.varkovich.lesson_20.task_2.model.VehiclesPicker;

/**
 * There is a service station. The service station can service a maximum of a certain number of cars.
 * Create a class that will be launched in a separate thread and will add cars for servicing to the service station.
 * Create a class that will be launched in a separate thread and will take repaired cars from the service station.
 * Let the maximum number of cars available for servicing be specified in the interface for storing constants.
 * Use synchronized, wait, notify.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        VehiclesAdder vehiclesAdder = new VehiclesAdder(serviceStation);
        VehiclesPicker vehiclesPicker = new VehiclesPicker(serviceStation);
    }
}
