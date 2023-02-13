package github.com.zcg.spring6.resourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resourceloader
 * @className: TestBean
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 10:52
 */
public class TestBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}
