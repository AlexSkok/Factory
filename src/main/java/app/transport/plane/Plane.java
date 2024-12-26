package app.transport.plane;

import app.transport.Transport;

public class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Is fly"); ;
    }
}
