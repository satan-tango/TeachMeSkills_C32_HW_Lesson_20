package com.varkovich.lesson_20.task_1.thread;


public class MorningRoutineByImplementing implements Runnable {
    Thread thread;
    private String threadNumber;

    public MorningRoutineByImplementing(String threadNumber) {
        thread = new Thread(this);
        this.threadNumber = threadNumber;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Read New York's time; thread number-> " + threadNumber);
        System.out.println("Drink coffee; thread number-> " + threadNumber);
        System.out.println("Eat breakfast; thread number-> " + threadNumber);
    }
}
