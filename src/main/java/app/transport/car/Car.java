package app.transport.car;

import app.transport.Transport;

public class Car implements Transport {
    @Override
    public String move() {
        return "Is ride";
    }
}
