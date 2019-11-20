package 单例模式;

import java.util.ArrayList;
import java.util.Random;

public class MultiEmperor {
    private static int maxNumOfEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<String>();

    private static ArrayList<MultiEmperor> emperors = new ArrayList<MultiEmperor>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperors.add(new MultiEmperor("皇帝" + (i + 1)));
        }
    }

    private MultiEmperor() {

    }

    private MultiEmperor(String name) {
        nameList.add(name);
    }

    public static MultiEmperor getInstance() {
        Random random = new Random();

        countNumOfEmperor = random.nextInt(maxNumOfEmperor);

        return emperors.get(countNumOfEmperor);
    }


    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
