package day52_Error_Exceptions.Exceptions;

public class NameException extends Exception{ // checked exception. Compiler tarafından denetlenen


    public NameException(String message) {
        super(message);
    }
}
