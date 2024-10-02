package tegh.chillo;

public class OuterClass {
     int x= 10;
    public static class InnerClass {
        public void print(){
            OuterClass class1 = new OuterClass();
            System.out.println(class1.x);
        }
    }
}
