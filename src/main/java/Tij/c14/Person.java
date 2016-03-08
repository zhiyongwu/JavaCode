package Tij.c14;

import Tij.uitl.Null;

/**
 * Created by wuzhiyong on 16/3/9.
 */
public class Person {
    private final String first;
    private final String last;
    private final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static class NullPerson extends Person implements Null{
        private NullPerson(){
            super("None","None","None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }
    public static final Person NULL = new NullPerson();
}

