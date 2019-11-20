package 单例模式;
/*
 * 饿汉式：开始直接创建
 * instance作为类变量在初始化的过程中会被收集进<clinit>()方法中，
 * 该方法能够确保同步，也就是说instance在多线程的情况下不可能被实例化两次，
 * 只是instance被ClassLoader加载后很长一段时间才被使用，instance实例所开辟的堆内存会驻留更久。
 * 饿汉式的单例设计模式可以保证多个线程下的唯一实例。
 */
public class Emperor {
    //饿汉式：开始直接创建
    private static final Emperor instance = new Emperor();

    //限制产生多个对象
    private Emperor() {
        System.out.println("im born");
    }

    //通过该方法获得实例对象
    public static Emperor getInstance() {
        return instance;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}
