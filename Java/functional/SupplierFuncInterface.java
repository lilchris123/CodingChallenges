package functional;
import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
    Supplier<T>- Functional Interface
        get()- returns value of type <T> 
*/
public class SupplierFuncInterface {

    public static void example(){
        Supplier<LocalDateTime> s= ()-> LocalDateTime.now();
        System.out.println(s.get());
    }
}
