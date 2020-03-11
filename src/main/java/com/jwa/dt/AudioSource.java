package com.jwa.dt;

import javax.inject.Inject;

public class AudioSource {

  @Inject
  PowerSource powerSource;

  @Inject
  public AudioSource() {
  }

  @Override
  public String toString() {
    return "AudioSource{" +
        "powerSource=" + powerSource +
        '}';
  }
}
