package decoratormode;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/6/3 13:40
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        /**
         * FilterInputStream为抽象装饰者。实例化时需要有InputStream
         * FileInputStream非装饰者,可以直接使用
         */
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:/Users/panfl/Desktop/test.txt")));
        while((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
        in.close();
    }
}
