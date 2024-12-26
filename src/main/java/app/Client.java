package app;

import app.transport.Transport;
import app.transport.TransportFactory;
import app.transport.car.CarFactory;
import app.transport.plane.PlaneFactory;

public class Client {
    public void run(){
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();
        Transport car =  carFactory.createTransport();
        Transport plane = planeFactory.createTransport();
        car.move();
        plane.move();
    }
}
