package 二十三种设计模式.结构型模式.代理模式._3_普通代理;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player = null;

    public GamePlayerProxy(String name) {
        try {
            player = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
