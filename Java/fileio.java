import java.util.Scanner;
import java.io.*;


class fileio implements a,b{

    public static void main(String[] args){
        try{
        File file= new File("myfile.txt");
            
        FileInputStream in =new FileInputStream(file);
        StringBuilder str=new StringBuilder();
        while(in.available() >0){
            str.append((char)in.read());
        }
        System.out.println(str);

        str.append("\nModified\n");

        String str1=str.toString();

        FileOutputStream out = new FileOutputStream("myfile2.txt");
        out.write(str1.getBytes());
        
        //Scanner scanner= new Scanner("myfile.txt");

        /*while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
        }*/
    }
    catch (Exception e){
        System.out.println("exception");
    }
    }
}