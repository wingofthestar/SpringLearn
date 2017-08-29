package site.yourdiary.collection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import site.yourdiary.collection.pojo.Movie;

import java.util.List;

public class MovieRecommender {
    @Autowired
    private List<Movie> movieList;

    public void printlist(){
        for (Movie m : movieList) {
            System.out.println(m);
        }
    }
}
