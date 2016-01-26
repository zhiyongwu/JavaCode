package Java.chapter9.exam;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/1/26.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:/Users/Admin/Desktop/seting.xml");
        System.out.println(file.lastModified());
        File dir = new File("files");
        dir.mkdir();
    }
}
