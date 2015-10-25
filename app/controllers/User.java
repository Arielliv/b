package controllers;

import play.mvc.Controller;

public class User extends Controller {
    private String userName;
    private String name;
    private String lastName;
    private String PassWord;
    private int countConnect;
    private int countPaging ;
    private int countOrder ;
    private int countTapName ;
    public User (String userName,String firstName,String lastName,String password){
        this.userName = userName;
        this.name = firstName;
        this.lastName = lastName;
        this.PassWord = password;
        this.countConnect = 0;
        this.countPaging = 0;
        this.countOrder = 0;
        this.countTapName = 0;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getPassWord(){
        return this.PassWord;
    }
    public int getCountConnect(){
        return this.countConnect;
    }
    public void incCountConnect(){
        this.countConnect++;
    }
    public int getCountPaging(){
        return this.countPaging;
    }
    public void incCountPaging(){
        this.countPaging++;
    }
    public int getCountOrder(){
        return this.countOrder;
    }
    public void incCountOrder(){
        this.countOrder++;
    }
    public int getCountTapName(){
        return this.countTapName;
    }
    public void incCountTapName(){
        this.countTapName++;
    }
}
