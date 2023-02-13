package github.com.zcg.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.io.IOException;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resource
 * @className: Url
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 9:54
 */
// UrlResource演示
public class UrlResourceDemo {


    public static void main(String[] args) {
        //http前缀
        loadUrlResource("http://www.baidu.com");

        //file前缀
        loadUrlResource("file:atguigu.txt");
    }

    //访问前缀http file
    public static void loadUrlResource(String path){


        try {
            // 创建Reource对象实现类UrlReource
            UrlResource urlResource = new UrlResource(path);

            //获取资源信息
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURI());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
