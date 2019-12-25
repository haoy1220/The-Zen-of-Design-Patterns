package 二十三种设计模式.创建型模式.单例模式;

/*
 * Holder方式
 * 借助类加载的特点，单例设计的最好方式之一.
 * 在类初始化的过程中不会创建类的实例，静态内部类Holder中定义了类的静态变量，并直接实例化，
 * 当Holder被主动引用时会创建类的实例，类实例的创建在Java编译时期收集在<clinit>()中，
 * 该方法又是同步方法，可以保证内存的可见性、JVM指令的顺序性以及原子性。
 */

public class Emperor6 {

    //限制产生多个对象
    private Emperor6() {
        System.out.println("im born");
    }

    //在静态内部类中持有类的实例，并且可直接被初始化
    private static class Holder {
        private static Emperor6 instance = new Emperor6();
    }

    //调用getInstance方法，事实上获得Holder的instance静态属性
    public static Emperor6 getInstance() {
        return Holder.instance;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}
