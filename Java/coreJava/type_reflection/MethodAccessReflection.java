package coreJava.type_reflection;

import java.lang.reflect.Method;

public class MethodAccessReflection {
    public static void callObjGetMethod(Object obj){
        try {
            Class<?> theClass = obj.getClass();
            Method m = theClass.getMethod("getName");
            Object result = m.invoke(obj);
            System.out.println("result: "+result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void callObjSetMethod(Object obj,int salary){
        try {
            Class<?> theClass = obj.getClass();
            Method m = theClass.getMethod("setSalary", int.class);
            m.invoke(obj, salary);
        }catch (Exception e){System.out.println(e.getMessage());}

    }
}
