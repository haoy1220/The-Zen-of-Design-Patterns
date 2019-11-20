package 工厂方法模式.女娲造人_多工厂模式;

public class Client {
    /*
     * 当然，在复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与各个子工厂交流，
     * 协调类的作用是封装子工厂类，对高层模块提供统一的访问接口。
     */
    public static void main(String[] args) {
        Human human1 = new YellowHumanFactory().createHuman();
        Human human2 = new BlackHumanFactory().createHuman();
        Human human3 = new WhiteHumanFactory().createHuman();
        human1.getColor();
        human1.talk();
        human2.talk();
        human2.getColor();
        human3.getColor();
        human3.talk();

    }

}
