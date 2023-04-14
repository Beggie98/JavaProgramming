package day49_Exceptions;

public class BreakTimeException extends RuntimeException{//BreakTimeException IS A RuntimeException (unchecked exception)

    public BreakTimeException(String message) {
        super(message);
    }

    public BreakTimeException(){
        super("It's time for a break");
    }

}
