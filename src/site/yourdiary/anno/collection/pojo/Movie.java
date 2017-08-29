package site.yourdiary.anno.collection.pojo;

public class Movie {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                '}';
    }
}
