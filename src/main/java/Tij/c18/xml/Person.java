package Tij.c18.xml;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class Person {
    private String first,last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Element getXML(){
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(last);
        person.appendChild(firstName);
        person.appendChild(lastName);
        return person;
    }

    public Person(Element person) {
        first = person.getFirstChildElement("first").getValue();
        last = person.getFirstChildElement("last").getValue();
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    public static void format(OutputStream os, Document doc) throws Exception{
        Serializer serializer = new Serializer(os,"ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }

    public static void main(String[] args) throws Exception {
        List<Person> list = Arrays.asList(new Person("a","A"),new Person("b","B"),new Person("c","C"));
        System.out.println(list);
        Element root = new Element("list");
        for (Person p:list
             ) {
            root.appendChild(p.getXML());
        }
        Document doc = new Document(root);
        format(System.out,doc);
        format(new BufferedOutputStream(new FileOutputStream("people.xml")),doc);
    }
}
