package tegh.chillo.ExceptionPackag;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(){}
    public InvalidAmountException(String message){
        super(message);
    }
}
