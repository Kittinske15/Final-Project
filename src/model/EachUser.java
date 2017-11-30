package model;

public class EachUser {

    private String user;
    private String pwd;

    public EachUser(String name, String pass) {
        user = name;
        pwd = pass;
    }

    /**
     * return user's name
     */
    public String getUser() {
        return user;
    }

    /**
     * return user's password
     */
    public String getPwd() {
        return pwd;
    }

}
