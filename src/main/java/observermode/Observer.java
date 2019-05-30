package observermode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/5/24 13:16
 */
public interface Observer {


    void update(float temp, float humidity, float pressure);
}
