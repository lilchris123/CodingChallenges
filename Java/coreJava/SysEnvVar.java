package coreJava;

public class SysEnvVar {
    public static void example(){
        //System variables
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.arch")+"\n");
        
        //Environment variables, App specific
        System.out.println(System.getenv("Name"));
    }
}
