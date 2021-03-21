package coreJava.string;
/*
Java Formatter documentation
- detailed format specifier information
- Parts of a specifier
    % (required)
    Conversion (required)
    Precision
    Flags
    Argument index

Java 8 date/time formatting
* */
public class Formatting {
    public static void format(){
        System.out.printf("W:%04d X:%04d\n", 5,50);
        System.out.printf("W:%04d X:%04d", 115,880);
    }
}
