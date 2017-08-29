package site.yourdiary.collection.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.collection.bean.Recommender;
import site.yourdiary.collection.config.RecommenderConfig;

/**
 * 测试集合类型的注入
 */
public class MovieRecommenderTest {

    private ApplicationContext context;


    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(RecommenderConfig.class);
    }

    @Test
    public void testdemo(){
//        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
//        movieRecommender.printlist();

        Recommender recommender = (Recommender) context.getBean("recommender");
        recommender.printMap();
    }


}
