package github.com.zcg.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resourceloader
 * @className: ResourceLoaderDemo
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 10:47
 */
public class ResourceLoaderDemo {


    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());

    }

    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());

    }
}
