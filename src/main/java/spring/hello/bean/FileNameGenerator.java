package spring.hello.bean;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class FileNameGenerator {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String generate() {
        System.out.println(this.name + "." + this.type);
        return null;
    }
}
