package Tij.c19;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public enum OzWitch {
    WEST("....."),
    NORTH("."),
    EAST("..");
    private String desc;

    OzWitch(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public static void main(String[] args) {
        for (OzWitch o:OzWitch.values()
             ) {
            System.out.println(o.getDesc());
        }
    }
}
