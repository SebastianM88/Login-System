import java.util.HashMap;

public class idAndPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    // Definition of the Constructor that will contain the access data of our login page
    idAndPasswords(){

        loginInfo.put("David" , "pizza");
        loginInfo.put("Gabriel" , "password");
        loginInfo.put("Code" , "cvb123");
    }

    // The method meant to be called up to return the user data
    protected HashMap getLoginInfo() {

        return loginInfo;
    }
}