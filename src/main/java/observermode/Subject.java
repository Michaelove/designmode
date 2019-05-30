package observermode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/5/24 13:15
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);


    void notifyObservers();

}
