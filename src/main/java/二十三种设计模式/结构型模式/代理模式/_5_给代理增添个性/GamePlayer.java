package 二十三种设计模式.结构型模式.代理模式._5_给代理增添个性;

public class GamePlayer implements IGamePlayer {
    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public IGamePlayer getProxy(){
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }


    private boolean isProxy(){
        if (this.proxy == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void login() {
        if (this.isProxy()){
            System.out.println(this.name + "登陆成功");
        }else {
            System.out.println("请使用代理访问！");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()){
            System.out.println(this.name + "击杀boss");
        }else {
            System.out.println("请使用代理访问！");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println(this.name + "升级了");
        }else {
            System.out.println("请使用代理访问！");
        }
    }
}
