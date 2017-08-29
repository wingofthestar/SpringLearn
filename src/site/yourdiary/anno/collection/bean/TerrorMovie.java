package site.yourdiary.anno.collection.bean;

import site.yourdiary.anno.collection.pojo.Movie;

public class TerrorMovie extends Movie {
    private String terrorWords;

    public String getTerrorWords() {
        return terrorWords;
    }

    public void setTerrorWords(String terrorWords) {
        this.terrorWords = terrorWords;
    }

    @Override
    public String toString() {
        return "TerrorMovie{" +
                "terrorWords='" + terrorWords + '\'' +
                '}';
    }
}
