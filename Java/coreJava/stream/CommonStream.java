package coreJava.stream;

import java.io.*;

public class CommonStream {
    // Input stream to read one byte at a time
    public static void inputStreamEx() throws IOException{
        byte[] byteArr= {93,50,100};
        InputStream input= new ByteArrayInputStream(byteArr);
        int intVal;
        while((intVal= input.read()) >= 0){
            System.out.print((byte)intVal + " ");
        }
    }

    // Input stream to read array of bytes
    public static void inputStreamBuffEx() throws IOException{
        byte[] byteArr= {93,50,100};
        InputStream input= new ByteArrayInputStream(byteArr);
        int length;
        byte[] byteBuff= new byte[10];
        while((length= input.read(byteBuff)) >= 0){
            for(int i=0; i< length; i++)
                System.out.print(byteBuff[i] + " ");
        }
    }

    //  Reader to read characters
    public static void readerEx() throws IOException{
        char[] charArr= {'C','h','r'};
        Reader reader= new CharArrayReader(charArr);
        int intVal;
        while((intVal= reader.read()) >= 0){
            System.out.print((char)intVal + " ");
        }
    }

    // read array of characters
    public static void readerBuffEx() throws IOException{
        char[] charArr= {'C','h','r'};
        Reader reader= new CharArrayReader(charArr);
        int length;
        char[] charBuff= new char[10];
        while((length= reader.read(charBuff)) >= 0){
            for(int i=0; i< length; i++)
                System.out.print(charBuff[i] + " ");
        }
    }

    // Output Stream to Write bytes
    public static void outputStreamEx() throws IOException{
        OutputStream out= new ByteArrayOutputStream(3);

        //write one byte to output stream
        byte byteVal=100;
        out.write(byteVal);

        //write array of bytes to output stream
        byte[] bytebuff= {50,21,80};
        out.write(bytebuff);
    }

    // Writer to Write characters
    public static void writerEx() throws IOException{
        Writer writer= new CharArrayWriter(3);

        //write one character to output stream
        char charVal='c';
        writer.write(charVal);

        //write array of characters to output stream
        char[] charbuff= {'a','b','c'};
        writer.write(charbuff);
    }
}
