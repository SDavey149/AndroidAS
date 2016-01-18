package uk.sdavey.androidas.model;

/**
 * Created by Scott Davey on 18/01/2016.
 */
public class Tyre {
    private double coreTemperature;
    private double dynamicPressure;
    private double dirtLevel;

    public Tyre() {

    }

    public double getCoreTemp() {
        return coreTemperature;
    }

    public double getDynamicPressure() {
        return dynamicPressure;
    }

    public double getDirtLevel() {
        return dirtLevel;
    }
}
