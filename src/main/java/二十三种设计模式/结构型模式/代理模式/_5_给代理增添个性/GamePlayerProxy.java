package 二十三种设计模式.结构型模式.代理模式._5_给代理增添个性;

public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player){
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

    @Override
    public void count() {
        System.out.println("本次收费10元！");;
    }
}
