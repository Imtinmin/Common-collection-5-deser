package payload;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class tinmin {
    public void hello(){
        System.out.println("hello");
    }
}

public class execute {
    public static void main(String[] args) throws Exception {
        Method xxx = Runtime.class.getMethod("getRuntime");
        System.out.println(xxx.toString());
        Runtime yyy = (Runtime) Runtime.class.getMethod("getRuntime").invoke(null);
        System.out.println(yyy.toString());
        Object t1 = new tinmin();
        Method ccc =  tinmin.class.getMethod("hello");
        ccc.invoke(t1);
    }
}

