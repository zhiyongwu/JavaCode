package Cralwer.util;

/**
 * Created by Administrator on 2016/2/1.
 */

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
<<<<<<< HEAD
import java.util.Collection;
=======
>>>>>>> origin/dev
import java.util.HashMap;
import java.util.Map;

/**
 * 操作Bean的类
 */
public class BeanUtil {

    /**
     * Bean转map
     *
     * @param obj
     * @return
     */
    public static Map<String, Object> transBean2Map(Object obj) {
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors
                    ) {

                String key = property.getName();
                Method getter = property.getReadMethod();
<<<<<<< HEAD
                if (!"class".equals(key)) {
                    map.put(key, getter.invoke(obj));
=======

                if (!"class".equals(key)) {
                    map.put(key, getter.invoke(obj));

>>>>>>> origin/dev
                    if (!"class".equals(key)) {
                        Object value = getter.invoke(obj);
                        map.put(key, value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * map转bean
     *
     * @param map
     * @param obj
     */

    public static void transMap2Bean(Map<String, Object> map, Object obj) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors
                    ) {
                String key = property.getName();
                if (map.containsKey(key)) {
                    Object value = map.get(key);
                    Method setter = property.getWriteMethod();
                    setter.invoke(obj, value);
                }
            }
        } catch (Exception e) {
            System.out.println("Map to Bean Error" + e);
        }
        return;
    }


}
