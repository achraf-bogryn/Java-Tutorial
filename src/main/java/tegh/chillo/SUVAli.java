package tegh.chillo;

public abstract class SUVAli extends Car2{
    @Override
    void autopilot() {
        System.out.println("Autopilot Ali");
    }
    abstract void streamingServices();
    abstract void parkingSensors();

}
