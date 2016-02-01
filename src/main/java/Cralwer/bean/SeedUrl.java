package Cralwer.bean;

/**
 * Created by Administrator on 2016/2/1.
 */
public class SeedUrl {
    private String link;
    private String name;

    @Override
    public String toString() {
        return "SeedUrl{" +
                "link='" + link + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
