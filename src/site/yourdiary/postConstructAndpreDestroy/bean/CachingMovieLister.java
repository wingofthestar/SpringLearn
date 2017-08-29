package site.yourdiary.postConstructAndpreDestroy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCache(){
        System.out.println("执行@PostConstruct标注的方法");
    }

    @PreDestroy
    public void clearMovieCache(){
        System.out.println("执行@PreDestroy标注的方法");
    }

    private Movie movie;

    @Autowired
    public void setMovie(Movie movie) {
        System.out.println("注入movie");
        this.movie = movie;
    }

    public void print(){
        System.out.println(movie.toString());
    }
}
