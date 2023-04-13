package user;

import shop.ShopHome;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public String name;
    private String id;
    public String phoneNo;
    private String password;
    public String address;
    public String type;

    public User(String name, String id, String phoneNo, String password, String address, String type) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.password = password;
        this.address = address;
        this.type = type;
    }

    private final Scanner input=new Scanner(System.in);

    public void login(){
        UserServer userSever=new UserServer();
        ArrayList<User> users= userSever.allUsers();

        System.out.print("Enter userid:");
        this.id=input.nextLine().toUpperCase();

        System.out.print("Enter Password:");
        this.password=input.nextLine().toUpperCase();

        boolean isUserFound=false;
        User currentUser=new User("","","","","","");

        for (int i = 0; i < users.size(); i++) {
            if (!id.equals(users.get(i).id.toUpperCase())) {
                isUserFound = false;

            } else if (!password.equals(users.get(i).password.toUpperCase())) {
                isUserFound = false;

            } else {

                isUserFound=true;
                currentUser= new User(users.get(i).name,users.get(i).id,
                        users.get(i).phoneNo,users.get(i).password,users.get(i).address,users.get(i).type);
                break;


            }
        }
        if (!isUserFound) {
            System.out.println("Invalid username or password");
            login();
        }
        else {
            ShopHome shopHome=new ShopHome();
            shopHome.showShopHomeFeatures(currentUser);



        }


    }

}