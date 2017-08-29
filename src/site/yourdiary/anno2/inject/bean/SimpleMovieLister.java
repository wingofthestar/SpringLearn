package site.yourdiary.anno2.inject.bean;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies(){
        System.out.println(this.movieFinder.toString());
    }

}
