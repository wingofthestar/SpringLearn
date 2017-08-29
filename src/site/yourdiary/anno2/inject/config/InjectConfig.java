package site.yourdiary.anno2.inject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.anno2.inject.bean.MovieFinder;

@Configuration
@ComponentScan("site.yourdiary.anno2.inject")
public class InjectConfig {

    @Bean
    public MovieFinder movieFinder(){
        MovieFinder movieFinder = new MovieFinder();
        movieFinder.setId(1);
        movieFinder.setName("Amovie");
        return movieFinder;
    }
}
