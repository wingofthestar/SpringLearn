package site.yourdiary.anno.primary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import site.yourdiary.anno.primary.bean.MovieCatalog;

@Configuration
@ComponentScan("site.yourdiary.primary")
public class MovieCatalogConfig {

    @Bean
    @Primary
    public MovieCatalog firstMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(1);
        movieCatalog.setName("first");
        return movieCatalog;
    }

    @Bean
    public MovieCatalog secondMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(2);
        movieCatalog.setName("second");
        return movieCatalog;
    }

}
