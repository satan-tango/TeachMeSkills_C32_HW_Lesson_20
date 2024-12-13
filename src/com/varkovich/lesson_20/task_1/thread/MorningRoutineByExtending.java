package com.varkovich.lesson_20.task_1.thread;

public class MorningRoutineByExtending extends Thread {

    private String threadNumber;

    public MorningRoutineByExtending(String threadNumber) {
        this.threadNumber = threadNumber;
        this.start();
    }

    @Override
    public void run() {
        System.out.println("Read New York's time; thread number-> " + threadNumber);
        System.out.println("Drink coffee; thread number-> " + threadNumber);
        System.out.println("Eat breakfast; thread number-> " + threadNumber);
    }
}
