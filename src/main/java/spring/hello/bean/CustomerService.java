package spring.hello.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wuzhiyong on 2016/8/4
 */

@Service
@Scope("prototype")
public class CustomerService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
