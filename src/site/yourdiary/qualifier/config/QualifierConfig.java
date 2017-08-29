package site.yourdiary.qualifier.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.qualifier.bean.MovieCatalog;
import site.yourdiary.qualifier.bean.MovieRecommender;

@Configuration
@ComponentScan("site.yourdiary.qualifier")
public class QualifierConfig {

    @Bean
    @Qualifier("main")
    public MovieCatalog fistMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(1);
        movieCatalog.setName("第一个movieCatalog");
        return movieCatalog;
    }

    @Bean
    @Qualifier("action")
    public MovieCatalog secondMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(2);
        movieCatalog.setName("第二个movieCatalog");
        return movieCatalog;
    }

    @Bean
    @Qualifier("action")
    public MovieCatalog thiredMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(3);
        movieCatalog.setName("第三个movieCatalog");
        return movieCatalog;
    }

    @Bean
    public MovieRecommender movieRecommender(){
        MovieRecommender movieRecommender = new MovieRecommender();
        return movieRecommender;
    }
}
