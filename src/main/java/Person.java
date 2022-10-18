public class Person {
    public Person(){
        id = 0;
    }
    public Person(String name) {
        this.name = name;
        id = 0;
    }

    private final long id;

    private String name;
    public Person(long id) {
        this.id = id;
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }


}
