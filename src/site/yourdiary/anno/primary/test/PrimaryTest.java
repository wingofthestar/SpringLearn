package site.yourdiary.anno.primary.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.anno.primary.bean.Movie;
import site.yourdiary.anno.primary.config.MovieCatalogConfig;

/**
 * 测试@Primary
 * 备注:声明bean，基于注解的方式，基于java config的方式，基于XML配置的方式可以随意组合
 */
public class PrimaryTest {

    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(MovieCatalogConfig.class);
    }

    @Test
    public void demotest(){
        for (String  name:
             context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        System.out.println("==============");
        Movie movie = (Movie) context.getBean("movie");
        movie.introduce();
    }
}
