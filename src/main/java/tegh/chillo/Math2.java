package tegh.chillo;

public class Math2  extends  Math{

    public Math2(int val){
        super(val);
    }
    
    public Math2(){};

    Math2 add(Math2 n2) {
        Math2 n3 = new Math2();
        n3.val = super.val + n2.val;
        return n3;
    }
}
