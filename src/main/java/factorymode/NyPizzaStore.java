package factorymode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/3 15:17
 */
public class NyPizzaStore extends PizzaStore{

    /**
     * 产出纽约风味的披萨
     * @param type
     * @return
     */
    @Override
    Pizza createPizza(String type) {
        return null;
    }

    public NyPizzaStore() {

    }
}
