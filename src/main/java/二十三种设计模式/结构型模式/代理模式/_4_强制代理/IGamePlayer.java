package 二十三种设计模式.结构型模式.代理模式._4_强制代理;

public interface IGamePlayer {
    public void login();

    public void killBoss();

    public void upgrade();

    public IGamePlayer getProxy();

}
