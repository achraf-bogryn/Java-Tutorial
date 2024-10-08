package tegh.chillo.interfacePackage;

public interface SelfDrivable {
     void destination(String d);
     void drive();

     // create non-abstract methode inside interface using default heyword
     default void newMethod(){
          System.out.println("new Methode using default keyword");
     }

}
