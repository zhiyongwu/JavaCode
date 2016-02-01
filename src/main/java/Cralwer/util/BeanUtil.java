package Cralwer.util;

/**
 * Created by Administrator on 2016/2/1.
 */

import Cralwer.bean.SeedUrl;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 操作Bean的类
 */
public class BeanUtil {
    public static Map<String,Object> transBean2Map(Object obj){
        if(obj == null){
            return null;
        }
        Map<String,Object> map = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property:propertyDescriptors
                 ) {

                String key = property.getName();
                Object value = property.getValue(key);
                if(!"class".equals(key)){
                    map.put(key,value);
                }

            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String,Object> map = transBean2Map(new SeedUrl("name","url"));
        for(String key:map.keySet()){
            System.out.println(key+"  " + map.get(key));
        }
    }

    //TODO   MAP2Bean
}
