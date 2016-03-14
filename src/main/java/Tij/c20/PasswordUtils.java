package Tij.c20;

import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class PasswordUtils {
    @UseCase(id = 47,description = "password must contains...")
    public boolean validatePasswd(String passwd){
        return passwd.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encyptPasswd(String passwd){
        return new StringBuilder(passwd).reverse().toString();
    }

    @UseCase(id=49,description = "can't equals previous used ones")
    public boolean checkPasswd(List<String> passs, String passwd){
        return !passs.contains(passwd);
    }

}
