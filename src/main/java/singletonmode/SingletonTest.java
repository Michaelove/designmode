package singletonmode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/21 15:36
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(SingletonOne.getInstance());

            }).start();
        }
    }
}
