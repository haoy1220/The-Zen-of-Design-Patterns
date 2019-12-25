package 二十三种设计模式.行为型模式.策略模式;

public class GiveGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
