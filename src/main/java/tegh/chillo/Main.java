package tegh.chillo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   MyClass obj = new MyClass();
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter the value the x :");
//   int x = sc.nextInt();
//   System.out.println("Enter the value the y :");
//   int y = sc.nextInt();
//   int sum = obj.add(x,y);
//   System.out.println("The sum is : "+sum);

//        Car myCar = new Car();
//        myCar.setName("tesla");
//        System.out.println(myCar.getName());
//        myCar.setModel(2014);
//        System.out.println(myCar.getModel());

//        Circle myCircle = new Circle();
//        myCircle.setRadius(150);
//        myCircle.setColor("green");
//        System.out.println("area of myCircle1 is : " + String.format("%.2f",myCircle.getArea()));
//        System.out.println("the Circumference o myCircle1 is : " + String.format("%.2f",myCircle.getCircumference()));
//        System.out.println("--------------------------------------------------------------");
//        System.out.println(myCircle.toString());

    Account a1 = new Account();
    a1.insert(123344,"achraf",1000);
//        a1.setAmount(200);
        a1.setName("achraf");
        a1.setAcountNo(1222);
        a1.deposit(100);
        a1.withdraw(100);
        a1.checkBalance();
        System.out.println(a1.toString());
    }
}


