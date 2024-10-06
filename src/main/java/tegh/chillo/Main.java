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

//    Account a1 = new Account();
//    a1.insert(123344,"achraf",1000);
////        a1.setAmount(200);
//        a1.setName("achraf");
//        a1.setAcountNo(1222);
//        a1.deposit(100);
//        a1.withdraw(100);
//        a1.checkBalance();
//        System.out.println(a1.toString());

//        System.out.println("No args constructor");
//        Product p1 = new Product();
//        p1.display();
//        System.out.println("---------------------------------");
//        System.out.println("Parametrize constructor");
//        Product p2 = new Product("camera","2088",198,18,17);
//        p2.display();
//        System.out.println("-------------------------------------");
//        System.out.println("chaining constructor");
//        Product p3 = new Product("camera","2088",198,18,17,"red");
//        p3.display();
//        System.out.println("-----------------------------------");
//        System.out.println("copy constructor");
//        Product p4 = new Product(p3);
//        p4.display();

//           Student s1 = new Student("achraf");
//           Student s2 = new Student("acdwd");
//           Student s3 = new Student("acd");
//           System.out.println(s1.toString());
//           System.out.println(s2.toString());
//           System.out.println(s3.toString());
//           Student.display();

//        Student s1 = new Student("ali","123");
//        Student s2 = new Student("achraf","456");
//        Student s3 = new Student("acc","789");
//        System.out.println(s1.logIn(1,"123"));
//        System.out.println(s2.logIn(2,"456"));
//        System.out.println(Student.validatePassword(s1.getPassword()));
//
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
//        innerClass.print();

//        Test obj = new Test();
//        obj.number = 1;
//        fun(obj);
////        System.out.println(obj.number) ;
//        Math n1 = new Math(2);
//        Math n2 = new Math(3);
//        Math n4 = new Math(5);
////      Math n3 = Math.add(n1,n2);
//        Math n3 = n1.add(n2);
//        System.out.println(n1.val);
//        System.out.println(n3.isEqual(n4));
//
//
//        Developer d1 =new Developer();

//        Employee e1 = new Employee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000);
//
//        SalarieEmployee e2 = new SalarieEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                160);
//
//        DailyEmployee e3 = new DailyEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                175,
//                30);
//
//        HourlyEmployee e4 = new HourlyEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                20,
//                250);
//
//        System.out.println("e1 Salary: " + e1.getSalary());
//        System.out.println("e2 Salary: " + e2.getSalary());
//        System.out.println("e3 Salary: " + e3.getSalary());
//        System.out.println("e4 Salary: " + e4.getSalary());

//        we can call all 4 classes in one object
//        object from super class can handle with methode that same between al child of super class
//        This objet call as polymorphic

//        Employee e1 = new Employee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000);
//        System.out.println("employee Salary: " + e1.getSalary());
//
//        e1 = new SalarieEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                160);
//        System.out.println("SalarieEmployee Salary: " + e1.getSalary());
//
//        e1 = new DailyEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                175,
//                30);
//        System.out.println("DailyEployee Salary: " + e1.getSalary());
//
//        e1 =  new HourlyEmployee("achraf",
//                "asjjraf@gmail",
//                "211",
//                "IT",
//                "maroc",
//                1999,
//                5000,
//                20,
//                250);
//        System.out.println("HourlyEmployee Salary: " + e1.getSalary());

//        Department dev=new Department(2344,"IT");
//        Employee2 e1 = new Employee2(1,
//                123.2f,"achraf","jd",
//                "asd",
//                "A",
//                "1245777",
//                "MAR",
//                2000,dev);
//        System.out.println(e1.toString());
       SUV suv = new SUV(22.3f , 22f ,4);
//        System.out.println(suv.getHeight());
//        System.out.println(suv.getWeight());
//        System.out.println(suv.getNumberOfWheels());
        Car2 car1 = new SUV();
        fun(car1);
        car1 = new Hatchback();
        fun(car1);



    }

    static void fun(Car2 obj){
        obj.autopilot();
    }
//
//    static void fun(Test n){
//        n.number++;

//    }
}


