package factorymode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/3 15:15
 */
public abstract class PizzaStore {
    /**
     * 生产pizza
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
