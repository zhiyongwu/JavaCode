package spring.hello.bean;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class OutputHelper {

    private IOutputGenerator outputGenerator;

    public void generator(){
        outputGenerator.printMsg();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
