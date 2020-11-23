package com.kzone;

import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {

    public static final int BOUND = 100;
    public static final int MULTIPLICATION = 10;
    public static final int DATA_COUNT = BOUND * MULTIPLICATION;

    public static void main(String[] args) throws IOException, RunnerException {
        System.out.println("Cores :: " + Runtime.getRuntime().availableProcessors());
        org.openjdk.jmh.Main.main(args);
    }
}
