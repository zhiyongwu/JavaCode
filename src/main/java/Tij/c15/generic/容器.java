package Tij.c15.generic;


/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class 容器<类型> {
    private 类型 对象;

    public 容器(类型 对象) {
        this.对象 = 对象;
    }

    public void 设置(类型 对象){
        this.对象 = 对象;
    }

    public 类型 获取内容(){
        return 对象;
    }

    public static void main(String[] args) {
        容器<String> r = new 容器<>("Hello ");
        r.设置("Hello World!");
        System.out.println(r.获取内容());
    }
}
