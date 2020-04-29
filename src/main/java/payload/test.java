package payload;

import org.apache.commons.collections.functors.InvokerTransformer;

import javax.management.relation.RoleUnresolved;

public class test {
    public static void main(String[] args) {
        InvokerTransformer invokerTransformer = new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{new String("gnome-calculator")});
        Object result = invokerTransformer.transform(Runtime.getRuntime());
    }
}
