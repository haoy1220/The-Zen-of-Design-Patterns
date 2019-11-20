package 单例模式;

/*
 * 懒汉式：通过if判断，没有再创建
 * 类被初始化时instance并没有被实例化，
 * getInstance()会判断instance是否被实例化，但是放在多线程的环境下进行分析，
 * 若有两个线程同时看到instance为null，那么instance将无法保证单例的唯一性。
 */
public class Emperor2 {
    //懒汉式：通过if判断，没有再创建
    private static Emperor2 instance = null;

    //限制产生多个对象
    private Emperor2() {
        System.out.println("im born");
    }

    //通过该方法获得实例对象，此处无法保证实例的唯一性
    public static Emperor2 getInstance() {
        if (instance == null) {
            instance = new Emperor2();
        }
        return instance;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}
