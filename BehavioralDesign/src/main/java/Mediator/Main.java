package Mediator;

public class Main {
    public static void main(String[] args) {
//        assertFalse(fan.isOn());
//
//        button.press();
//        assertTrue(fan.isOn());
//
//        button.press();
//        assertFalse(fan.isOn());
    }
}

class PowerSupplier {
    public void turnOn() {
        // implementation
    }

    public void turnOff() {
        // implementation
    }
}

class Fan1 {
    private PowerSupplier powerSupplier;
    public boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }
}

class Button1 {
    private Fan1 fan;

    // constructor, getters and setters

    public void press(){
        if(fan.isOn){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}

class Mediator {
    private Fan fan;
    private PowerSupplier powerSupplier;

    // constructor, getters and setters

    public void press() {
        if (fan.isOn) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}

class Button {
    private Mediator mediator;

    // constructor, getters and setters

    public void press() {
        mediator.press();
    }
}

class Fan {
    private Mediator mediator;
    public boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}