package observermode;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/5/24 13:41
 */
public class RunMethod {


    public static void main(String[] args) {
        List<String> stringList = Lists.newArrayList("one", "two", "three");
        String reduce = stringList.stream().reduce("", (acc, element) -> acc + element);
        System.out.println(reduce);
    }
}
