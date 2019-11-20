package 单例模式;

/*
 * 懒汉式+同步方法
 * 这里instance其实就是共享资源（数据），当多个线程访问时，需要保证数据的同步性，这种方式满足了懒加载又能保证instance实例的唯一性，
 * 但是synchronized的排他性导致getInstance()只能在同一时刻被一个线程访问，性能低下。
 */
public class Emperor3 {
    //懒汉式：通过if判断，没有再创建
    private static Emperor3 instance = null;

    //限制产生多个对象
    private Emperor3() {
        System.out.println("im born");
    }

    //通过该方法获得实例对象，通过同步保证实例的唯一性
    public static synchronized Emperor3 getInstance() {
        if (instance == null) {
            instance = new Emperor3();
        }
        return instance;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}
