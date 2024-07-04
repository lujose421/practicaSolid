package com.nttdata.bootcamp.solid.dip.violation.solution;

public class RacingCar implements Vehicule {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}
