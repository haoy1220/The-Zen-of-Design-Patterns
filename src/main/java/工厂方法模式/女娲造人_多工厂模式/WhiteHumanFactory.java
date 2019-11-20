package 工厂方法模式.女娲造人_多工厂模式;

public class WhiteHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new WhiteHuman();
    }
}
