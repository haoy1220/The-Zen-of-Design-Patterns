package 策略模式;

public class Client {
    public static void main(String[] args) {
        Context context;

        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println("\n\n");

        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GiveGreenLight());
        context.operate(); //执行了第二个锦囊了
        System.out.println("\n\n");

        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 -------------");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n\n");
    }
}
