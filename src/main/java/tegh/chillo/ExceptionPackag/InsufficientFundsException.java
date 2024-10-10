package tegh.chillo.ExceptionPackag;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){}
    public InsufficientFundsException(String message){
        super(message);
    }
}
