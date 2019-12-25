package 二十三种设计模式.创建型模式.单例模式;

import java.net.Socket;

/*
 * volatile+Double-Check
 * 高效的数据同步策略,volatile可以防止指令重排序（避免Double-Check下的空指针问题）
 * 这种方式满足多线程下的单例、懒加载以及获取实例的高效性。
 */
public class Emperor5 {
    //懒汉式：通过if判断，没有再创建
    private static volatile Emperor5 instance = null;

    Socket socket;

    //限制产生多个对象
    private Emperor5() {
        this.socket = new Socket();
        System.out.println("im born");
    }

    //通过该方法获得实例对象，通过同步保证实例的唯一性
    public static Emperor5 getInstance() {
        if (instance == null) {
            //当instance为null时，进入同步代码块，同时可避免了每次都需要进入同步代码块，可提高效率
            synchronized (Emperor5.class) {
                if (instance == null) {
                    instance = new Emperor5();
                }
            }

        }
        return instance;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}
