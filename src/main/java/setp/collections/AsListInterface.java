package setp.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> list = Arrays.asList(new A(), new B(), new C());
//        list.add(new Snow());
        System.out.println(list);
    }
}

class Snow {
}

class A extends Snow {
}

class B extends Snow {
}

class C extends Snow {
}
