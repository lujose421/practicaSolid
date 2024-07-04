package com.nttdata.bootcamp.solid.ocp.violation.solution;

import com.nttdata.bootcamp.solid.ocp.violation.solution.DrivingMode;

import java.util.HashMap;
import java.util.Map;

public class EventHandler {
    private final Map<DrivingMode, DrivingModeStrategy> strategies;
    private final Vehicule vehicule;

    public EventHandler(Vehicule vehicule) {
        this.vehicule = vehicule;
        strategies = new HashMap<>();
        strategies.put(DrivingMode.SPORT, new SportMode());
        strategies.put(DrivingMode.COMFORT, new ConfortMode());
        strategies.put(DrivingMode.ECONOMY, new EconomyMode());

    }

    public void changeDrivingMode(DrivingMode drivingMode) {
        DrivingModeStrategy strategy = strategies.getOrDefault(drivingMode, new ConfortMode());
        strategy.applyMode(vehicule);
    }
}
