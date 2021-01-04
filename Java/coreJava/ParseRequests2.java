package coreJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ParseRequests2 {
   static int parseReqBytes(String req){
       String[] results= req.split(" ");
       int len= results.length;
    return Integer.parseInt(results[len-1]);
    }
    public static void parseRequests() throws IOException{
        Scanner scan= new Scanner(System.in);

        //take input from user
        String filename= scan.nextLine();
        scan.close();
        
        //load file to scanner or reader
        File inputFile =new File(filename);
        scan =new Scanner(inputFile);

        //list to store requests
        List<String> reqs= new ArrayList<>();
        
        //read file and store to our list
        while(scan.hasNextLine()){
            reqs.add(scan.nextLine());
        }

        scan.close();

        // set variables to store our results
        int numReq = 0;
        int sum = 0;
        int reqBytes=0;
        // logic to for numOfRequest bytes > 5000 and their sum
        for(String req: reqs){
            reqBytes= parseReqBytes(req);
            if(reqBytes > 5000){
                numReq++;
                sum += reqBytes;
            }
        }
        //create output file with prefix "bytes_" + filename
        File outFile = new File("bytes_"+ filename);
        //load file to our filewriter
        FileWriter writer= new FileWriter(outFile);
        //write our results to file
        writer.write(numReq+"\n");
        writer.write(""+sum);
        writer.close();
    }
}
