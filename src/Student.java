public class Student {
    private String name;
    private String surname;
    private static int lastId = 0;
    private long id;

    public Student( String name,String surname) {
        this.surname = surname;
        this.name = name;
        this.id = lastId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
