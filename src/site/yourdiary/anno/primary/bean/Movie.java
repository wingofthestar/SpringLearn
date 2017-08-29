package site.yourdiary.anno.primary.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private MovieCatalog movieCatalog;

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

    @Autowired
    public void setMovieCatalog(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void introduce(){
        System.out.println(movieCatalog.toString());
    }
}
