package shop;

import product.Product;
import product.ProductList;
import user.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ShopHome {
    Scanner input=new Scanner(System.in);
    ArrayList<Product> products =new ArrayList<Product>();
    public void showShopHomeFeatures(User user) {
        System.out.println("1.Profile");
        System.out.println("2.Products");
        System.out.println("3.Buy Product");
        System.out.println("4.Search Product");
        System.out.println("5.Logout");

        for(;;){
        System.out.print("Enter a Option:");
        int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println(user.name);
                    System.out.println(user.phoneNo);
                    System.out.println(user.address);
                    System.out.println(user.type);

                    break;

                case 2:
                    showProduct();
                    break;
                case 3:
                    buyProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    exit();

                    break;

                default:
                    System.out.println("Option Not Found");
            }
        }}

    private void exit() {

    }


    private void buyProduct() {
        ProductList productServer =new ProductList();
        productServer.createProduct();
        products= productServer.proudcts;
        System.out.print("Product Name:");
        String buyProductName = input.next();

        boolean isProductAvailable = false;


        for (int i = 0; i < products.size(); i++) {

            if (buyProductName.toLowerCase()
                    .equals(products.get(i).getTitle().toLowerCase())) {

                System.out.print("Enter product code: ");
                String productCode=input.next();

                System.out.println("Your Order Product Price is "+products.get(i).getPrice());

                System.out.println("Are you want to buy?(yes/no)");
                String opinion=input.next();

                if (opinion.equals("yes")){
                    System.out.println("Order successfully Created");
                    System.out.println(products.get(i).getTitle());
                    System.out.println(1);
                    System.out.println(products.get(i).getColor());
                    System.out.println(products.get(i).getPrice());
                    System.out.println(products.get(i).getType());
                    System.out.println("\n");
                }else {
                    break;
                }


                isProductAvailable = true;
                break;

            }


        }

        if (isProductAvailable == false) {
            System.out.println("Product not found");
        }


    }
    private void showProduct(){
        ProductList productServer =new ProductList();
        productServer.createProduct();
        products= productServer.proudcts;

        for (int i = 0; i < products.size() ; i++) {

            System.out.println(products.get(i).getTitle());
            System.out.println(products.get(i).quantity);
            System.out.println(products.get(i).getColor());
            System.out.println(products.get(i).getPrice());
            System.out.println(products.get(i).getType());


        }
    }

    private void searchProduct(){
        ProductList productServer =new ProductList();
        productServer.createProduct();
        products= productServer.proudcts;

        System.out.print("Search Product:");
        String searchItem= input.next();


        boolean isProductAvailable=false;



        for (int i = 0; i < products.size() ; i++) {

            if (searchItem.toLowerCase()
                    .equals(products.get(i).getTitle().toLowerCase()))
            {

                System.out.println(products.get(i).getTitle());
                System.out.println(products.get(i).quantity);
                System.out.println(products.get(i).getColor());
                System.out.println(products.get(i).getPrice());
                System.out.println(products.get(i).getType());
                System.out.println("\n");

                isProductAvailable=true;
                break;

            }


        }

        if (isProductAvailable==false){
            System.out.println("Product not found");
        }
    }
}