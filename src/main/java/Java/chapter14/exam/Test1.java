package Java.chapter14.exam;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Test1 extends Object {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        Calendar c = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.MONTH));
        BigDecimal b = new BigDecimal("12654646464613213");
        System.out.println(b.add(new BigDecimal("123658954")));
    }
}
