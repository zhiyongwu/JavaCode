package Tij.c14;

/**
 * Created by wuzhiyong on 16/3/9.
 */
public class Position {
    private Person person;
    private String title;

    public Position(Person person, String title) {
        this.person = person;
        this.title = title;
        if(person == null){
            person = Person.NULL;
        }
    }

    public Position(String title){
        this.person = Person.NULL;
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if(person == null){
            person = Person.NULL;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Position{" +
                "person=" + person +
                ", title='" + title + '\'' +
                '}';
    }
}
