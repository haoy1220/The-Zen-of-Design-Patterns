package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人_多工厂模式;

public abstract class AbstractHumanFactory {

    //不需要参数选定了，因为都是专用的
    public abstract Human createHuman();
}
