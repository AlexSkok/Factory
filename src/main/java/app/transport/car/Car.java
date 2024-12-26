package app.transport.car;

import app.transport.Transport;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Is ride");;
    }
}
