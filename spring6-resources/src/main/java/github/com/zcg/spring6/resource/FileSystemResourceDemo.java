package github.com.zcg.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resource
 * @className: FileSystemResourceDemo
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 10:37
 */

// 访问系统资源
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        loadFileResource("./atguigu.txt");
    }

    public static void loadFileResource(String path) {
        // 创建对象
        FileSystemResource fileSystemResource = new FileSystemResource(path);
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());

        try {
            InputStream inputStream = fileSystemResource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes)!=-1){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
