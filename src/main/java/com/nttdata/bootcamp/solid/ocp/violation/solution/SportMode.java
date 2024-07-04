package com.nttdata.bootcamp.solid.ocp.violation.solution;

public class SportMode implements DrivingModeStrategy {
    @Override
    public void applyMode(Vehicule vehicule) {
        vehicule.setPower(500);
        vehicule.setSuspensionHeight(10);
    }
}
