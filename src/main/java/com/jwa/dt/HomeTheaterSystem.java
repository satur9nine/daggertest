package com.jwa.dt;

import javax.inject.Inject;

public class HomeTheaterSystem {

  @Inject
  Speaker left;

  @Inject
  Speaker right;

  @Inject
  Amp amp;

  @Inject
  AudioSource audioSource;

  @Inject
  public HomeTheaterSystem() {

  }

  @Override
  public String toString() {
    return "HomeTheaterSystem{" +
        "this=" + super.toString() +
        ", left=" + left +
        ", right=" + right +
        ", amp=" + amp +
        ", audioSource=" + audioSource +
        '}';
  }
}
