package tegh.chillo;

public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    void setModel(int m) {
        if(m >= 2015) {
            this.model = m;
        }
        else {
            System.out.println("Invalid model");
        }
    }
    public int getModel() {
        return model;
    }


}
