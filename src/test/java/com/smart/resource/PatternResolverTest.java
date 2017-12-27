package com.smart.resource;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import static org.testng.Assert.*;

public class PatternResolverTest {
    @Test
    public void getResources() throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        //加载com.smart下以.xml为后缀的资源
        Resource resources[] = resolver.getResources("classpath*:com/smart/**/*.xml");
        assertNotNull(resources);

        for (Resource resource : resources) {
            System.out.println(resource.getFilename());
        }

    }
}
