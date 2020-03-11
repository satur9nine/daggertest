package com.jwa.dt;


import dagger.Module;
import dagger.Provides;

@Module
public class HomeTheaterSystemModule {

  @Provides
  public static HomeTheaterSystem provideHts() {
    return new HomeTheaterSystem();
  }

}
