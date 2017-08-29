package site.yourdiary.anno.postConstructAndpreDestroy.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.anno.postConstructAndpreDestroy.bean.CachingMovieLister;
import site.yourdiary.anno.postConstructAndpreDestroy.cofig.PostConstructConfig;

public class PostConstructTest {

    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(PostConstructConfig.class);
    }

    @Test
    public void demoTest(){
        CachingMovieLister cachingMovieLister = (CachingMovieLister) context.getBean("cachingMovieLister");
        cachingMovieLister.print();
    }

    @After
    public void afer(){
        ((AnnotationConfigApplicationContext)context).destroy();
    }
}
