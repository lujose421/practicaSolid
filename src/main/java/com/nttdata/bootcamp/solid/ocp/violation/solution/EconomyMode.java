package com.nttdata.bootcamp.solid.ocp.violation.solution;

public class EconomyMode implements DrivingModeStrategy{
    @Override
    public void applyMode(Vehicule vehicule) {
        vehicule.setPower(200);
        vehicule.setSuspensionHeight(30);
    }
}
