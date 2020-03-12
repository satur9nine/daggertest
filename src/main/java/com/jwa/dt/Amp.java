package com.jwa.dt;

import javax.inject.Inject;

public class Amp {

  @Inject
  PowerSource powerSource;

  @Inject
  public Amp() {
  }

  @Override
  public String toString() {
    return "Amp{" +
        "this=" + super.toString() +
        ", powerSource=" + powerSource +
        '}';
  }
}
