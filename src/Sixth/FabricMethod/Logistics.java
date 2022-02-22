package Sixth.FabricMethod;

public class Logistics {
    Transport transport;

    void createTransport(int code){
        if(code == 1){
            transport = new Truck();
        }
        else if(code == 2){
            transport = new Ship();
        }
    }

    public Transport getTransport() {
        return transport;
    }

}
