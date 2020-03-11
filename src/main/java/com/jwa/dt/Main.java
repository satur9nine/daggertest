package com.jwa.dt;


import dagger.Component;

public class Main {

    @Component(modules = HomeTheaterSystemModule.class)
    interface HomeTheaterSystemBuilder {
        HomeTheaterSystem dothings();
    }

    public void log() {
        HomeTheaterSystem homeTheaterSystem = DaggerMain_HomeTheaterSystemBuilder.builder().build().dothings();
        System.out.println("I have " + homeTheaterSystem);
    }

    public static void main(String[] args) {
        new Main().log();
    }
}
