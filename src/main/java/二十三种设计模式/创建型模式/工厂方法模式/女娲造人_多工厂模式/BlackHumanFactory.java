package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人_多工厂模式;

public class BlackHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new BlackHuman();
    }
}
