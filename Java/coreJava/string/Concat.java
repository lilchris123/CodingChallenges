package coreJava.string;

import java.util.StringJoiner;

public class Concat {
    public static void example(){
        //example: "fn_name=chris ls_name=mayol dob=1999-01-10"
        String table= System.getProperty("table");
        String recordsLine= System.getProperty("records");
        String[] records= recordsLine.split(",");

        //insert each record
        for(String rec: records){
            String[] colPairs=rec.split(" ");
            //insert current record to table
            insert(table,colPairs);
        }
    }
    public static void insert(String table, String[] colPairs){

        StringJoiner  colJoiner= new StringJoiner(",","(",")");
        StringJoiner  valJoiner= new StringJoiner(",","(",")");

        for(String colPair: colPairs){
           String[] col= colPair.split("=");
           colJoiner.add(col[0]);
           valJoiner.add(String.format("\"%s\"",col[1]));
        }
        String query= String.format("INSERT INTO %s%s VALUES%s", table,colJoiner.toString(),valJoiner.toString());
        System.out.println(query);
    }
}
