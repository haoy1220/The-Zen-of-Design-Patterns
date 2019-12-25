package 二十三种设计模式.创建型模式.单例模式;
/*
 * 枚举方式
 * 枚举类型不允许被继承，同时是线程安全且只能被实例化一次。
 */

public enum Emperor7 {

    INSTANCE;

    //限制产生多个对象
    Emperor7() {
        System.out.println("im born");
    }

    //在静态内部类中持有类的实例，并且可直接被初始化
    private static void method() {
        //调用该方法会主动使用Singleton,INSTANCE将会被实例化
    }

    //调用getInstance方法，事实上获得Holder的instance静态属性
    public static Emperor7 getInstance() {
        return INSTANCE;
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}

//枚举类型不允许被继承，同时是线程安全且只能被实例化一次，但是枚举类型不能够懒加载，对类主动使用，
//如果用其中的静态方法INSTANCE会立即实例化，可对其进行改造，增加懒加载的特性，类似于Holder方式：

