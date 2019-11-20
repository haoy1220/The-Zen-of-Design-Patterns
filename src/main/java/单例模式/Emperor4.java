package 单例模式;

import java.net.Socket;
import java.sql.Connection;

/*
 * Double-Check
 * 高效的数据同步策略，首次初始化时加锁，之后允许多个线程同时进行getInstance调用来获得实例
 * 当有两个线程发现null==instance成立时，只有一个线程有资格进入同步代码块，完成对instance的实例化，
 * 随后的线程发现null==instance不成立则不进行任何动作，以后对getInstance的访问就不需要数据同步保护了。
 * 这种方法既满足了懒加载，又保证了instance实例的唯一性，可以允许多个线程同时对getInstance进行访问，
 * 但在多线程的情况下可能会引起空指针(进入同步块的线程刚刚创建好instance实例，而构造方法里的变量还没实例化，另一个线程就访问这个变量了)。
 */
public class Emperor4 {
    //懒汉式：通过if判断，没有再创建
    private static Emperor4 instance = null;

    Socket socket;

    //限制产生多个对象
    private Emperor4() {
        this.socket = new Socket();
        System.out.println("im born");
    }

    //通过该方法获得实例对象，通过同步保证实例的唯一性
    public static Emperor4 getInstance() {
        if (instance == null) {
            //当instance为null时，进入同步代码块，同时可避免了每次都需要进入同步代码块，可提高效率
            synchronized (Emperor4.class) {
                if (instance == null) {
                    instance = new Emperor4();
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
