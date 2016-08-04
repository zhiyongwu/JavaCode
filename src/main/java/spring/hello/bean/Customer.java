package spring.hello.bean;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class Customer {
    public Customer() {
    }

    private Person person;

    public Customer(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person +
                '}';
    }
}
