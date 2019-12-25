package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人_简单工厂模式;

public class Client extends HumanFactory {

    public static void main(String[] args) {
        Human human1 = HumanFactory.createHuman(YellowHuman.class);
        Human human2 = HumanFactory.createHuman(WhiteHuman.class);
        Human human3 = HumanFactory.createHuman(BlackHuman.class);
        human1.getColor();
        human1.talk();
        human2.talk();
        human2.getColor();
        human3.getColor();
        human3.talk();

    }

}
