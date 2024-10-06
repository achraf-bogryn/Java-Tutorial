package tegh.chillo;

public class SUV extends Car2{
    public SUV(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }

    public SUV(){}

    @Override
    void autopilot() {
        System.out.println("SUV autopilot");
    }

    @Override
    void streamingServices() {
     System.out.println("SUV streamingServices");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV parkingSensors");
    }
}
