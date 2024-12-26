package app.transport.plane;

import app.transport.Transport;
import app.transport.TransportFactory;

public class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
