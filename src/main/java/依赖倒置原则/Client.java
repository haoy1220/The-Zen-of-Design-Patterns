package 依赖倒置原则;

public class Client {
    public static void main(String[] args) {

        ICar iCar = new Bmw();
        IDriver idriver = new Driver(iCar);//屏蔽掉除静态类型类外的属性和方法
        idriver.driver(iCar);
        idriver.driver();
    }
}

interface IDriver{
    public void driver(ICar icar);

    public void driver();
}

interface ICar{
    public void run();
}

class Driver implements IDriver{//接口声明依赖对象，也叫接口注入
    private ICar iCar;

    public Driver(ICar iCar){//构造函数传递依赖对象
        this.iCar = iCar;
    }

    public void setter(ICar iCar){//Setter方法传递依赖对象
        this.iCar = iCar;
    }

    public void driver(){
        this.iCar.run();
    }

    public void driver(ICar icar) {
        icar.run();
    }


}

class Benz implements ICar{
    public void run() {
        System.out.println("im benz");
    }
}

class Bmw implements ICar{

    public void run() {
        System.out.println("im Bmw");
    }
}