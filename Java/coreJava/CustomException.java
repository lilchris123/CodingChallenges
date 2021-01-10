package coreJava;
//Creating a custom exception by extending the Exception class
public class CustomException extends Exception{

    public CustomException(String err) {
        super(err);
    }
}
