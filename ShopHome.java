package shop;


import user.User;


import java.util.Scanner;

public class ShopHome {
    Scanner input=new Scanner(System.in);

    public void showShopHomeFeatures(User user) {
        System.out.println("1.Profile");
        System.out.println("2.Products");
        System.out.println("3.Buy Product");
        System.out.println("4.Search Product");
        System.out.println("5.Logout");
    }
}
