package tegh.chillo.AnonymosInnerClass;

public class Main {
    public interface Showable{
        public void print();
    }

    static void display(Showable s){
        s.print();
    }
    public static void main(String[] args) {
    RewardClass emp1 = new RewardClass();
    RewardClass emp2 = new RewardClass();
    RewardClass emp3 = new RewardClass(){

        @Override
        public void rewardMethod(){
            System.out.println("your reward is 20$");
        }
    };

//    this way if we want call method just one time
//        new RewardClass(){
//            @Override
//            public void rewardMethod(){
//                System.out.println("your reward is 20$");
//            }
//        }.rewardMethod();


// we using AnonymosInnerclass to implement an interface
    Showable sh1 = new Showable() {
        @Override
        public void print() {
            System.out.println("implement methode inside interface by using anonymos Ineer Classs");
        }
    };

//    Lambda expression , we using lambda expression when   we have single method
        Showable sh ;
        sh = () ->{
            System.out.println("iplement print methode using lambda expressions");
        };

//        sh1.print();
//        sh.print();

//         Define anonymos inner class as parameter
        display(new Showable() {
            @Override
            public void print() {
                System.out.println("implmenet methode by passing " +
                        "anonymous inner class as parameter");
            }
        });

//      using lambda expression
        Showable sh2;
        display(sh2 = () ->
                System.out.println("also call anonymous inner class as parameter But by using lambda expression")); ;



//    emp1.rewardMethod();// 10
//    emp2.rewardMethod();//10
//    emp3.rewardMethod();//20
//        System.out.println(emp1.getClass());
//        System.out.println(emp2.getClass());
//        System.out.println(emp3.getClass());

//        ------------------------------------------------------------------------
//        Part two of anonymos innerclass
        TesTClass test1 =new TesTClass(){
            @Override
            public void testMethod(){
                System.out.println("Test 1");
            }
        };
        test1.testMethod();

// We using var keyword for access to extra class mean class we create in anonymos
// inner class that don't exist in super class
        var test2 = new TesTClass(){
            @Override
            public void testMethod(){
                System.out.println("Test methde");
            }
            public void testMethod2(){
                System.out.println("Extra Class");
            }
        };
        test2.testMethod2();


    }
}
