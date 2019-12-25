package 二十三种设计模式.结构型模式.代理模式._6_动态代理;

public class GamePlayer implements IGamePlayer {
    public String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(this.name + "登陆成功！");

    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "击杀boss！");

    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升级！");

    }
}
