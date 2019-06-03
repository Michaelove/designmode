package factorymode;

import com.google.common.collect.Lists;

import java.util.ArrayList;

import lombok.Data;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/3 15:10
 */
@Data
public class Pizza {
    private String name;
    /**
     * 面团
     */
    private String dough;

    /**
     * 酱
     */
    private String sauce;

    /**
     * 佐料
     */
    private ArrayList toppings = Lists.newArrayList();

    void prepare() {}

    void bake() {}

    void cut() {}

    void box() {}


}
