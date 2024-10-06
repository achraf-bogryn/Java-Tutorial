package tegh.chillo;

public class Hatchback extends Car2{
    public Hatchback(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }
    public Hatchback(){}

    @Override
    void autopilot() {
        System.out.println("Hatchback autopilot");
    }

    @Override
    void streamingServices() {
        System.out.println("hathcback streamingServices");
    }

    @Override
    void parkingSensors() {
    System.out.println("hathcback parkingSensors");
    }
}
