package com.nttdata.bootcamp.solid.srp.violation.solution;

public class FuelTank {
    private final int maxFuel;
    private int remainingFuel;

    public FuelTank(int maxFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public void reFuel() {
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void consumeFuel() {
        remainingFuel--;
    }
}
