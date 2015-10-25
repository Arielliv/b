package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;

/**
 * Created by Ariel on 22/10/2015.
 */
public class Users extends Controller {
    private static int count = 0;
    private static ArrayList<User> Test = new ArrayList()
    {{
            add(new User("a","a","1","a"));
            add(new User("b","b","2","b"));
    }};


    public void AddUser(String UserName,String FirstName,String LastName,String Password){
        count ++;
        User count = new User(UserName,FirstName,LastName,Password);
        Test.add(count);
    }

    public static void DelUser(String UserName){
        for (int i = 0; i < Test.size();i++){
            if(Test.get(i).getUserName().equals(UserName)){
                Test.remove(i);
                break;
            }
        }
    }

    public User getUser(String UserName){
        User x = null;
        for (User y : Test){
            if(y.getUserName().equals(UserName)){
                x = y;
                break;
            }
        }
        return x;
    }

    public String userExists(String UserName){
        String flag = "User doesn't exists...";
        for(int i = 0;i < Test.size();i++){
            if(Test.get(i).getUserName().equals(UserName)){
                flag = "User exists!";
                break;
            }
        }
        return flag;
    }


    public static Result getUsers()
    {
        return ok(Json.toJson(Test));
    }

    public static Result delUserN(String username){
        DelUser(username);
        return ok("deleted");
    }
}



