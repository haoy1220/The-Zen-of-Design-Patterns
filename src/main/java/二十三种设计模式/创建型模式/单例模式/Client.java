package 二十三种设计模式.创建型模式.单例模式;

public class Client {
    public static void main(String[] args) {
        Emperor emperor = Emperor.getInstance();
        emperor.say();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.say();

        Emperor emperor3 = Emperor.getInstance();
        emperor3.say();


        //限定多例模式
        int ministerNum = 19;
        for (int i = 0; i < ministerNum; i++) {
            MultiEmperor multiEmperor = MultiEmperor.getInstance();
            System.out.println("第" + (i + 1) + "个大臣拜见的是");
            multiEmperor.say();
        }

        Emperor7 emperor7 = Emperor7.getInstance();
        emperor7.say();
        Emperor7 emperor8 = Emperor7.getInstance();
        emperor8.say();
        Emperor7 emperor9 = Emperor7.getInstance();
        emperor9.say();
    }
}
