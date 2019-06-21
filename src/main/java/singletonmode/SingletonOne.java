package singletonmode;

/**
 * @Author: Loong
 * @Description 饿汉式单例
 * @Date: 2019/6/21 15:31
 */
public class SingletonOne {
    private static SingletonOne ourInstance = new SingletonOne();

    public static SingletonOne getInstance() {
        return ourInstance;
    }

    private SingletonOne() {
    }
}
