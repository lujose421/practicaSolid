package com.nttdata.bootcamp.solid.srp.violation.solution;


public class Vehicule {
    private FuelTank fuelTank;

    public Vehicule(int maxFuel) {
        this.fuelTank = new FuelTank(maxFuel);
    }

    public void acelerate() {
        fuelTank.consumeFuel();
    }
}
