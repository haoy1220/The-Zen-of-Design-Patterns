package 二十三种设计模式.结构型模式.代理模式._4_强制代理;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login() {
        this.player.login();
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
