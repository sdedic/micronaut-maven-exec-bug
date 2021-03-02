package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        System.err.println("Passed parameters:");
        for (String s : args) {
            System.err.println("- \"" + s + '"');
        }
        Micronaut.run(Application.class, args);
    }
}
