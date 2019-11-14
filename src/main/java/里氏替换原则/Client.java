package 里氏替换原则;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Father father = new Father();
//        Son father = new Son();//可以完全替换父类而结果一致
        HashMap hashMap = new HashMap();
        father.doSomething(hashMap);
    }

}

class Father{
    public Collection doSomething(HashMap hashMap){
        System.out.println("im father");
        return hashMap.values();
    }
}

class Son extends Father{
//    @Override//加上这个会报错
    public Collection doSomething(Map map){//参数不同，这是重载，不是重写
        System.out.println("im son");
        return map.values();
    }
}
