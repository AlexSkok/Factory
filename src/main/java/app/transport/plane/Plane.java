package app.transport.plane;

import app.transport.Transport;

public class Plane implements Transport {
    @Override
    public String move() {
        return "Is fly";
    }
}
