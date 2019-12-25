package 二十三种设计模式.结构型模式.代理模式._3_普通代理;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {

        //屏蔽了普通用户
        IGamePlayer proxy = new GamePlayerProxy("草榴");

        System.out.println("开始时间：" + LocalDateTime.now());

        proxy.login();

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + LocalDateTime.now());
    }

}
