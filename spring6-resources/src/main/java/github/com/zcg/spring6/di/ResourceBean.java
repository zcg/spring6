package github.com.zcg.spring6.di;

import org.springframework.core.io.Resource;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.di
 * @className: ResourceBean
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 11:01
 */
public class ResourceBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
