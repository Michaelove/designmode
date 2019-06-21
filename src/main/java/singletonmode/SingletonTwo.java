package singletonmode;

/**
 * @Author: Loong
 * @Description 懒汉式单例，多线程下不安全
 * @Date: 2019/6/21 15:32
 */
public class SingletonTwo {
    private static SingletonTwo ourInstance;

    public static SingletonTwo getInstance() {
        if (ourInstance == null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ourInstance = new SingletonTwo();
        }
        return ourInstance;
    }

    private SingletonTwo() {
    }
}
