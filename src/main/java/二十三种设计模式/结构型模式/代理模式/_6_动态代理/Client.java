package 二十三种设计模式.结构型模式.代理模式._6_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("圣诞节");

        InvocationHandler handler = new GamePlayerIH(player);

        System.out.println("开始游戏：" + LocalDateTime.now());

        ClassLoader classLoader = player.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束游戏：" + LocalDateTime.now());
    }
}
