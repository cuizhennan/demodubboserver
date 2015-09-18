package demo.main;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
@SpringBootApplication
public class Main {

    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
        context.start();
        System.out.println("按任意键退出");
        try {
            System.in.read();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
