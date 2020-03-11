package com.jwa.dt;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class HomeTheaterSystem {

  @Inject
  Speaker left;

  @Inject
  Speaker right;

  @Inject
  Amp amp;

  @Inject
  AudioSource audioSource;

  public HomeTheaterSystem() {

  }

  @Override
  public String toString() {
    return "HomeTheaterSystem{" +
        "left=" + left +
        ", right=" + right +
        ", amp=" + amp +
        ", audioSource=" + audioSource +
        '}';
  }
}
