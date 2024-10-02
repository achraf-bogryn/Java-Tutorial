package tegh.chillo;

public class Math {
    int val;

    Math(int val) {
        this.val = val;
    }
    Math(){

    }

//    Method 1
//    static Math add(Math n1 ,Math n2) {
//      Math n3 = new Math();
//      n3.val = n1.val + n2.val;
//      return n3;
//    }
 Math add(Math n2) {
    Math n3 = new Math();
    n3.val = this.val + n2.val;
    return n3;
}

// Comparing between two objet value
    Boolean isEqual(Math n2) {
        return this.val == n2.val;
    }
}
