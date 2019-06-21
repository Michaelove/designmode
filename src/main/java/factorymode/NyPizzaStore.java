package factorymode;

import java.util.UUID;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/3 15:17
 */
public class NyPizzaStore extends PizzaStore{

    /**
     * 产出纽约风味的披萨,对于子类有自己的实现
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
