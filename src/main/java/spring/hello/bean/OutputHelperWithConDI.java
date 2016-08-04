package spring.hello.bean;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class OutputHelperWithConDI {
    private IOutputGenerator generator;

    public void generate(){
        generator.printMsg();
    }

    public OutputHelperWithConDI(IOutputGenerator generator) {
        this.generator = generator;
    }
}
