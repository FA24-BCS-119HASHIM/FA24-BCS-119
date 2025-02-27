public class PasswordValidator{
     
 private static final String storedUsername="abc";
private static final String storedPassword="abc1";


public void setPassword(String password){
                  password=storedPassword;
}
public String setPassword(String password){
                 return password;
}
public void setUsername(String username){
                  username=storedUsername;
}

public void setUsername(String username){
                  return username;
}



public static boolean authenticate(String username, String password){
                 if(username.equal(storedUsername)&& Password.equal(storedPassword)
}


