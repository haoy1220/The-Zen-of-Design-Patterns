package 二十三种设计模式.结构型模式.代理模式._4_强制代理;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {

        //强制使用代理访问
        IGamePlayer player = new GamePlayer("解决");

        IGamePlayer proxy = player.getProxy();

        System.out.println("开始时间：" + LocalDateTime.now());

        proxy.login();

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + LocalDateTime.now());
    }

}
