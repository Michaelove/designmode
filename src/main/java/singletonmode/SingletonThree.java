package singletonmode;

/**
 * @Author: Loong
 * @Description 懒汉式单例子，使用双重检查加锁解决多线程不安全的情况
 * @Date: 2019/6/21 15:34
 */
public class SingletonThree {
    private static volatile SingletonThree ourInstance;

    public static SingletonThree getInstance() {
        if (ourInstance == null) {
            synchronized (SingletonThree.class) {
                if (ourInstance == null) {
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ourInstance = new SingletonThree();
                }
            }
        }
        return ourInstance;
    }

    private SingletonThree() {
    }
}
