package com.varkovich.lesson_20.task_1;

import com.varkovich.lesson_20.task_1.thread.MorningRoutineByExtending;
import com.varkovich.lesson_20.task_1.thread.MorningRoutineByImplementing;

/**
 * Create a program that simulates the morning: reading the news, tomorrow, coffee.
 * Set each thread to a name and priority from the config file.
 * Let there be 3 threads.
 * Create and run 3 threads.
 * Make two options: using the Runnable interface and/or using the Thread class
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Thread fisrtThread = new MorningRoutineByExtending("1");
        MorningRoutineByImplementing secondThread = new MorningRoutineByImplementing("2");
        MorningRoutineByImplementing thirdThread = new MorningRoutineByImplementing("3");
    }
}