package com.jwa.dt;


import dagger.Component;

import javax.inject.Singleton;

public class Main {

    @Singleton
    @Component
    interface HomeTheaterSystemBuilder {
        HomeTheaterSystem makeOne();
    }

    public void log() {
        System.out.println("I made a " + DaggerMain_HomeTheaterSystemBuilder.create().makeOne());
        System.out.println("I made a " + DaggerMain_HomeTheaterSystemBuilder.create().makeOne());
    }

    public static void main(String[] args) {
        new Main().log();
    }
}
