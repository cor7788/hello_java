package com.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 打印方法调用，格式例如：a.compareTo(b), c.toString()
        String params = "()";
        if(args != null && args.length > 0) {
            params = Arrays.toString(args).replace("[", "(").replace("]", ")");
        }
        System.out.printf("%s.%s%s\n", target.toString(), method.getName(), params);
        return method.invoke(target, args);
    }
}
