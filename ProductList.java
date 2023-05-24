package product;

import java.util.ArrayList;

public class ProductList {
    public ArrayList<Product> proudcts =new ArrayList<Product>();

    public void createProduct(){

        proudcts.add(new Product("T-Shirt",3,
                3999.0,"Black","Garments"));

        proudcts.add(new Product("Geans",10,
                2999.0,"Blue","Garments"));

        proudcts.add(new Product("Shirt",3,
                1999.0,"Red","Garments"));

        proudcts.add(new Product("Shoe",88,
                999.0,"White","Shoe"));
    }
}