package com.nttdata.bootcamp.solid.ocp.violation.solution;

public class ConfortMode implements DrivingModeStrategy{
    @Override
    public void applyMode(Vehicule vehicule) {
        vehicule.setPower(400);
        vehicule.setSuspensionHeight(20);
    }
}
