package 二十三种设计模式.结构型模式.代理模式._5_给代理增添个性;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        System.out.println("开始时间：" + LocalDateTime.now());

        IGamePlayer player = new GamePlayer("叫阿宝");
        IGamePlayer proxy = player.getProxy();

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间：" + LocalDateTime.now());
    }
}
