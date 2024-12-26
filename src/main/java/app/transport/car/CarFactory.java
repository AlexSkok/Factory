package app.transport.car;

import app.transport.Transport;
import app.transport.TransportFactory;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
