package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name,int orcNumber){
        setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "orcNumber=" + orcNumber + '\'' +super.toString() +
                '}';
    }


    public static void main(String[] args) {
        Orc x = new Orc("Lim",12);
        System.out.println(x);
        x.change("zz",21);
        System.out.println(x);
    }
}

class Villain{
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}
