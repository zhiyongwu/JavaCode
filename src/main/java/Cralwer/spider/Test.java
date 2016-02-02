package Cralwer.spider;

import Cralwer.bean.SeedUrl;
import Cralwer.util.BeanUtil;
import Cralwer.util.CastUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/2.
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("link","linkvalue");
        map.put("name","namevalue");
        SeedUrl seedUrl = new SeedUrl();
        BeanUtil.transMap2Bean(map,seedUrl);
        System.out.println(seedUrl);
        System.out.println(map);
    }
}
