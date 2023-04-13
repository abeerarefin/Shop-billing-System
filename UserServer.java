package user;

import java.util.ArrayList;

public class UserServer {
    ArrayList<User> users=new ArrayList<User>();

    public ArrayList<User> allUsers(){


        users.add(new Shopper("Abir","abeer05",
                "01748556482","35810",
                "Dhaka,Bangladesh","Shopper"));



        return users;
    }
}