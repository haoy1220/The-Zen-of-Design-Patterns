package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人_简单工厂模式;

/*
 * 简单工厂模式：也就是只有一个工厂的模式
 * 1.去除继承的抽象类；
 * 2.将生产方法变为static
 */
public class HumanFactory{
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
