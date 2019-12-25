package 二十三种设计模式.结构型模式.代理模式._1_自己打游戏;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("草帽");

        System.out.println("开始时间：" + LocalDateTime.now());

        player.login();

        player.killBoss();

        player.upgrade();

        System.out.println("结束时间：" + LocalDateTime.now());
    }

}
