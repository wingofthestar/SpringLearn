package site.yourdiary.resource.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.resource.bean.MovieRecommender;
import site.yourdiary.resource.config.ResourceConfig;

public class ResourceTest {

    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(ResourceConfig.class);
    }

    @Test
    public void demotest(){
        for (String name:
                context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        System.out.println("==========================");
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        movieRecommender.print();
    }
}
