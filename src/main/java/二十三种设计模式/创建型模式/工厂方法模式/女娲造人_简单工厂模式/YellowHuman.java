package 二十三种设计模式.创建型模式.工厂方法模式.女娲造人_简单工厂模式;

public class YellowHuman extends HumanFactory implements Human {
    public void getColor() {
        System.out.println("my skin is Yellow!!!");
    }

    public void talk() {
        System.out.println("im yellow!!!");
    }
}
