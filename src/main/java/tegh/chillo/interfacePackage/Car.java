package tegh.chillo.interfacePackage;

public class Car <T>  implements GenericInterfce <T> {
    @Override
    public T carModel() {
        return (T) new CarV1();
    }
}
