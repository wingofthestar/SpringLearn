package site.yourdiary.collection.bean;

import site.yourdiary.collection.pojo.Movie;

public class LoveMovie extends Movie {
    private int loveId;

    public int getLoveId() {
        return loveId;
    }

    public void setLoveId(int loveId) {
        this.loveId = loveId;
    }

    @Override
    public String toString() {
        return "LoveMovie{" +
                "loveId=" + loveId +
                '}';
    }
}
