package site.yourdiary.anno.resource.bean;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MovieRecommender {

    private MovieCatalog movieCatalog;

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

//    @Resource(name = "fistMovieCatalog")
    @Resource
    public void setMovieCatalog(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void print(){
        System.out.println(movieCatalog.toString());
        System.out.println("MovieRecommender的方法执行完毕");
    }
}
