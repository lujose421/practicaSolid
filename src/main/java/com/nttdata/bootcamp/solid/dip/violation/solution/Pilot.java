package com.nttdata.bootcamp.solid.dip.violation.solution;

public class Pilot {
    private Vehicule vehicule;

    public Pilot(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void increasedSpeed() {
        vehicule.accelerate();
    }
}

