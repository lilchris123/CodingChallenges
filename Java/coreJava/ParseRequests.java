package coreJava;
import java.io.*;
import java.util.*;


public class ParseRequests {

    private static final Scanner scan = new Scanner(System.in);
    
    static int parseforBytes(String req){
        String[] results= req.split(" ");
        int len= results.length;
        return Integer.parseInt(results[len-1]);
    }
    public static void parseRequests() throws IOException{

        // read the string filename
        String filename;
        filename = scan.nextLine();
        scan.close();
        
        File inFile= new File(filename);
        Scanner readScanner= new Scanner(inFile);
        List<String> requests= new ArrayList<>();
        
        while(readScanner.hasNextLine()){
            requests.add(readScanner.nextLine());
            
        }
        readScanner.close();
        
        int countReq =0;
        int sum=0;
        for(String req : requests){
            int reqNumBytes = parseforBytes(req);
        
            if(reqNumBytes > 5000){
                countReq++;
                sum+= reqNumBytes;
            }
        }
        //output filename
        File outputFile= new File("bytes_"+filename);
        FileWriter writer= new FileWriter(outputFile);
        writer.write(countReq+"\n");
        writer.write(""+sum);
        writer.close();
        
    }
}

