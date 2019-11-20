package 工厂方法模式;


public class General {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
         * 继续业务处理
         */
    }
}

//抽象产品类
abstract class Product {
    //产品类的公共方法
    public void method() {
        //业务逻辑处理
    }

    //抽象方法
    public abstract void method2();
}


//具体产品类
class ConcreteProduct1 extends Product {
    public void method2() {
        //业务处理逻辑
    }
}

class ConcreteProduct2 extends Product {
    public void method2() {
        //业务处理逻辑
    }
}

class ConcreteProduct3 extends Product {
    public void method2() {
        //业务处理逻辑
    }
}


//抽象工厂类

abstract class Creator {
    /*
     * 通过定义泛型对输入参数产生了两层限制：
     * 1.必须是Class类型；
     * 2.必须是Product的子类。
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}

//具体产品类
class ConcreteCreator extends Creator {

    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
