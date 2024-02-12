public class Course {
    private String title;
    private String description;
    private static int lastId = 0;
    private long id;

    public Course( String title, String description) {
        this.description = description;
        this.title = title;
        this.id = lastId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }
}
