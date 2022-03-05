package Adapter;


public class Main {
}

interface Movable {
    // returns speed in MPH
    double getSpeed();
}

class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}

interface MovableAdapter {
    // returns speed in KM/H
    double getSpeed();
}

class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    // standard constructors

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}