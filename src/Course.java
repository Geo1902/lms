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

}
