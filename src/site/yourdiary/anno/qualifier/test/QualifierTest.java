package site.yourdiary.anno.qualifier.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.anno.qualifier.bean.MovieListRecommender;
import site.yourdiary.anno.qualifier.bean.MovieRecommender;
import site.yourdiary.anno.qualifier.config.QualifierConfig;

public class QualifierTest {
    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(QualifierConfig.class);
    }

    @Test
    public void demoTest(){
        for (String name:
                context.getBeanDefinitionNames()) {
            System.out.println(name);

        }
        System.out.println("=====================");
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        movieRecommender.print();
    }

    /**
     * 注入集合测试
     */
    @Test
    public void demoListTest(){
        MovieListRecommender movieListRecommender = (MovieListRecommender) context.getBean("movieListRecommender");
        movieListRecommender.printList();
    }
}
