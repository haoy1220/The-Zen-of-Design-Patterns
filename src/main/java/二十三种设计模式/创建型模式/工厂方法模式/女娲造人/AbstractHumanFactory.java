package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人;

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
