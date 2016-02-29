package JavaWeb.javanp;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2016/1/25.
 */
public class LogFile {
    private Writer out;

    public LogFile(File f) throws IOException {
        FileWriter fw = new FileWriter(f);
        this.out = new BufferedWriter(fw);
    }

    public synchronized void writeEntry(String message) throws IOException {

        Date d = new Date();
        out.write(d.toString());
        out.write('\t');
        out.write(message);
        out.write("\r\n");

    }

    public void close() throws IOException {
        out.flush();
        out.close();
    }
}
