package day52_Error_Exceptions.Exceptions;

public class AgeException extends RuntimeException{ //unchecked exception

    public AgeException(String message) {
        super(message);
    }
}
