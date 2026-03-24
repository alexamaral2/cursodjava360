package login;

public class StaticLoginMethod implements LoginMethod{

    public static final String USERNAME = "admin";
    public static final String PASSWORD = "123";

    private String username;
    private String password;

    public StaticLoginMethod(){
      this(USERNAME, PASSWORD);
    }

    public StaticLoginMethod(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

}
