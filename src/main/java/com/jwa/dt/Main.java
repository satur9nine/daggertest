package com.jwa.dt;


import dagger.Component;

import javax.inject.Singleton;

public class Main {

    @Singleton
    @Component
    interface MainFactory {
        HomeTheaterSystem createHomeTheaterSystem();
    }

    // There shall be only one @Component otherwise Singletons are not Singletons
    static final MainFactory sMainFactory = DaggerMain_MainFactory.create();

    public void log() {
        System.out.println("I made a " + sMainFactory.createHomeTheaterSystem());
        System.out.println("I made a " + sMainFactory.createHomeTheaterSystem());
    }

    public static void main(String[] args) {
        new Main().log();
    }
}
