package 单例模式;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/*
 * 类似于Holder方式
 * 枚举类型不允许被继承，同时是线程安全且只能被实例化一次
 */
public class Emperor8 {
    //限制产生多个对象
    private Emperor8() {
        System.out.println("im born");
    }

    //在静态内部类中持有类的实例，并且可直接被初始化
    private enum EnumHolder {
        INSTANCE;

        private Emperor8 instance;

        EnumHolder(){
            this.instance = new Emperor8();
        }

        public Emperor8 getEmperor8(){
            return instance;
        }
    }

    public static Emperor8 getInstance(){
        return EnumHolder.INSTANCE.getEmperor8();
    }

    //类中其他方法尽量是static
    public static void say() {
        System.out.println("im emperor");
    }
}

