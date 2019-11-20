package 工厂方法模式.女娲造人_多工厂模式;

public abstract class AbstractHumanFactory {

    //不需要参数选定了，因为都是专用的
    public abstract Human createHuman();
}
