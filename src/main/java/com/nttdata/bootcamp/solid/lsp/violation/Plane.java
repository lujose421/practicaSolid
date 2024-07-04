package com.nttdata.bootcamp.solid.lsp.violation;

public class Plane extends Vehicle {
    @Override
    public void changeGear(Gear gear) {
        if (Gear.R.equals(gear) && getGear().equals(Gear.D)) {
            System.out.println("Cambiar a la marcha de reversa del motor mientras avanza hacia adelante.");
        } else {
            super.changeGear(gear);
        }
    }
// A plane can reverse engine gear while moving forward, no problem here
}
