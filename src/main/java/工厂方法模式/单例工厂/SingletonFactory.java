package 工厂方法模式.单例工厂;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonFactory {
    /*
     * 以上通过工厂方法模式创建了一个单例对象，
     * 该框架可以继续扩展，在一个项目中可以产生一个单例构造器，
     * 所有需要产生单例的类都遵循一定的规则（构造方法是private），
     * 然后通过扩展该框架，只要输入一个类型就可以获得唯一的一个实例。
     */
    private static Singleton singleton;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());

            //获得无参构造
            Constructor constructor = clazz.getDeclaredConstructor();

            //设置无参构造是可访问的
            constructor.setAccessible(true);

            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
