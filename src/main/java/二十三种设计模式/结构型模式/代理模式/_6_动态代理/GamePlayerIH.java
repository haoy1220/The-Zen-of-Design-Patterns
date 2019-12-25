package 二十三种设计模式.结构型模式.代理模式._6_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
    //被代理者
    Class aClass = null;

    //被代理的实例
    Object object = null;

    //我要代理谁
    public GamePlayerIH(Object object) {
        this.object = object;
    }

    //被代理方法（所有）
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);

        //如果是登录方法，则发送消息
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用你的账号登录呢！！！！！！！");
        }
        return result;

    }
}
