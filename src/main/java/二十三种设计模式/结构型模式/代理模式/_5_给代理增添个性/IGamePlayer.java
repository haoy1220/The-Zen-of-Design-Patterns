package 二十三种设计模式.结构型模式.代理模式._5_给代理增添个性;

public interface IGamePlayer {
    public void login();

    public void killBoss();

    public void upgrade();

    IGamePlayer getProxy();
}
