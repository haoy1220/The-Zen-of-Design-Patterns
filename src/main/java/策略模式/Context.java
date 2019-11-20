package 策略模式;


public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }

}



