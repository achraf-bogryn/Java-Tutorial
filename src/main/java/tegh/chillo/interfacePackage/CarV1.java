package tegh.chillo.interfacePackage;

public class CarV1 implements Movable , SelfDrivable{
    private int x , y;
    private int numberOfPassengers;

    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public CarV1(){}

    public CarV1(int x, int y, int numberOfPassengers) {
        this.x = x;
        this.y = y;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void moveUp() {
      y--;
    }

    @Override
    public void moveDown() {
       y++;
    }

    @Override
    public void moveLeft() {
     x--;
    }

    @Override
    public void moveRight() {
      x++;
    }

    @Override
    public void destination(String d) {
        System.out.println("distination is : "+ d);
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
