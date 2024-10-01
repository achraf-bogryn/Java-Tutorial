package tegh.chillo;

import java.util.Scanner;

public class MyClass {
//    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int x, y, z;
//        System.out.print("Enter X coordinate : ");
//        x = in.nextInt();
//        System.out.print("Enter Y coordinate : ");
//        y = in.nextInt();
//        System.out.print("Enter Z coordinate : ");
//        z = in.nextInt();
//        int min = min(x, y, z);
//        System.out.println("min Number is : " + min);
//        int max = max(x, y, z);
//        System.out.println("max Number is : " + max);
//    }
//
//        static int min(int n1 , int n2 , int n3){
//            int minNumber= n1;
//            if(minNumber>n2){
//                minNumber= n2;
//            }
//            if(minNumber>n3){
//                minNumber= n3;
//            }
//            return minNumber;
    
//        }
//
//
//
//        static int max(int n1 , int n2 , int n3){
//            int minNumber= n1;
//            if(minNumber<n2){
//                minNumber= n2;
//            }
//            if(minNumber<n3) {
//                minNumber= n3;
//            }
//            return minNumber;
//        }

        public int x ;
        public int y ;

        public int add(int x , int y){
            System.out.println("Value of  x:"+ x);
            System.out.println("Value of  y:"+ y);
            int sum = x + y;
            return sum;
        }

}
