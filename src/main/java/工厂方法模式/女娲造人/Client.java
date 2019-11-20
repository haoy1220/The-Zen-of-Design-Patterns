package 工厂方法模式.女娲造人;

public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human human1 = humanFactory.createHuman(YellowHuman.class);
        Human human2 = humanFactory.createHuman(WhiteHuman.class);
        Human human3 = humanFactory.createHuman(BlackHuman.class);
        human1.getColor();
        human1.talk();
        human2.talk();
        human2.getColor();
        human3.getColor();
        human3.talk();

    }

}
