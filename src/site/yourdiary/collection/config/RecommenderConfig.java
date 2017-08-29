package site.yourdiary.collection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.collection.bean.LoveMovie;
import site.yourdiary.collection.bean.TerrorMovie;
import site.yourdiary.collection.pojo.Movie;
import site.yourdiary.collection.bean.MovieRecommender;
import site.yourdiary.collection.bean.Recommender;


@Configuration
@ComponentScan("site.yourdiary.collection")
public class RecommenderConfig {


    @Bean
    public Movie loveMovie(){
        LoveMovie loveMovie = new LoveMovie();
        loveMovie.setLoveId(2);
        return loveMovie;
    }

    @Bean
    public Movie terrorMovie(){
        TerrorMovie terror = new TerrorMovie();
        terror.setTerrorWords("hellow");
        return terror;
    }

    @Bean
    public MovieRecommender movieRecommender(){
        return new MovieRecommender();
    }

    @Bean
    public Recommender recommender(){
        return new Recommender();
    }

}
