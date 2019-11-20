package 工厂方法模式.延迟加载工厂;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //判断prMap中有没有对象，有直接返回
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            //没有就生产
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            //生产完加入prMap，以便下次使用
            prMap.put(type, product);
        }
        return product;
    }

    /*
     * 1.代码还比较简单，通过定义一个Map容器，容纳所有产生的对象，如果在Map容器中已经有的对象，则直接取出返回；
     * 如果没有，则根据需要的类型产生一个对象并放入到Map容器中，以方便下次调用。
     * 2.延迟加载框架是可以扩展的，例如限制某一个产品类的最大实例化数量，可以通过判断Map中已有的对象数量来实现，这样的处理是非常有意义的，
     * 例如JDBC连接数据库，都会要求设置一个MaxConnections最大连接数量，该数量就是内存中最大实例化的数量。
     * 3.延迟加载还可以用在对象初始化比较复杂的情况下，
     * 例如硬件访问，涉及多方面的交互，则可以通过延迟加载降低对象的产生和销毁带来的复杂性。
     */
}
