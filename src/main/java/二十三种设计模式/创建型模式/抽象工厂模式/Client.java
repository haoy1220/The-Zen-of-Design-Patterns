package 二十三种设计模式.创建型模式.抽象工厂模式;

public class Client {
}


//抽象产品A
abstract class AbstractProductA {
    public void shareMethod() {

    }

    public abstract void doSomething();
}


//具体产品
class ProductA1 extends AbstractProductA {
    public void doSomething() {
        System.out.println("生产产品a1");
    }
}

class ProductA2 extends AbstractProductA {
    public void doSomething() {
        System.out.println("生产产品a2");
    }
}


//抽象产品B
abstract class AbstractProductB {
    public void shareMethod() {

    }

    public abstract void doSomething();
}


//具体产品
class ProductB1 extends AbstractProductB {
    public void doSomething() {
        System.out.println("生产产品B1");
    }
}

class ProductB2 extends AbstractProductB {
    public void doSomething() {
        System.out.println("生产产品B2");
    }
}


//抽象工厂类
abstract class AbstractCreator {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}

