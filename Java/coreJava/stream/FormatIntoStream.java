package coreJava.stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class FormatIntoStream {
    //Writing Formatted Content to a Stream
    public static void doWrite(String name, int age ) throws IOException {
        BufferedWriter writer= Files.newBufferedWriter(Paths.get("files/myfile.txt"));

        //try with resources will auto close classes that implements closeable
        try(Formatter f= new Formatter(writer)){
            f.format("My name is %s and I'm %d years old",name,age);
        }
    }
}
