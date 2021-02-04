package designPatterns;
/*
    Singleton Design Pattern Implementation
*/
public class Singleton {
    Singleton instance;

    private Singleton(){}

    public Singleton getInstance(){
        if(instance != null)
            return instance;

        instance= new Singleton();
        return instance;
    }
}
