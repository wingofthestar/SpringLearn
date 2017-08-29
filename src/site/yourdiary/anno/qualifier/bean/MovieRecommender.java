package site.yourdiary.anno.qualifier.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MovieRecommender {
    @Autowired
    @Qualifier("main")
    private MovieCatalog movieCatalog;

    public void print(){
        System.out.println(movieCatalog.toString());
        System.out.println("MovieRecommender的方法执行完毕");
    }
}
