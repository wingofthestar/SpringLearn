package site.yourdiary.collection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import site.yourdiary.collection.pojo.Movie;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Recommender {

    @Autowired
    private Map<String, Movie> movieMap;

    public void printMap(){
        System.out.println("=======key========");
            Set<String> keySet = movieMap.keySet();
            for(String ckey : keySet){
                System.out.println(ckey);
            }
        System.out.println("========values========");

        Collection<Movie> values = movieMap.values();
        for(Movie value: values){
            System.out.println(value);
        }

    }
}
