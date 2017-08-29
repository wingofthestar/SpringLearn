package site.yourdiary.anno.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.anno.resource.bean.MovieCatalog;


@Configuration
@ComponentScan("site.yourdiary.resource")
public class ResourceConfig {

    @Bean
    public MovieCatalog fistMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(1);
        movieCatalog.setName("第一个movieCatalog");
        return movieCatalog;
    }

    @Bean
//    @Primary
    public MovieCatalog secondMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(2);
        movieCatalog.setName("第二个movieCatalog");
        return movieCatalog;
    }

    @Bean
    public MovieCatalog thiredMovieCatalog(){
        MovieCatalog movieCatalog = new MovieCatalog();
        movieCatalog.setId(3);
        movieCatalog.setName("第三个movieCatalog");
        return movieCatalog;
    }

//    @Bean
//    public MovieCatalog movieCatalog(){
//        MovieCatalog movieCatalog = new MovieCatalog();
//        movieCatalog.setId(4);
//        movieCatalog.setName("Bean名称为movieCatalog");
//        return movieCatalog;
//    }
}
