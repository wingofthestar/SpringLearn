package site.yourdiary.anno.qualifier.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieListRecommender {
    private List<MovieCatalog> movieCatalogList;

    public List<MovieCatalog> getMovieCatalogList() {
        return movieCatalogList;
    }

    @Autowired
    @Qualifier("action")
    public void setMovieCatalogList(List<MovieCatalog> movieCatalogList) {
        this.movieCatalogList = movieCatalogList;
    }

    public void printList(){
        for (MovieCatalog m:
             movieCatalogList) {
            System.out.println(m.toString());
        }
    }
}
