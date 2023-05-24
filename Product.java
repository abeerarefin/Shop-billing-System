package product;

public class Product {
    private String title;
    public int quantity;
    public double price;
    private String color;
    String type;

    public Product(String title, int quantity,
                   double price, String color, String type) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public static class Payment {

    }
}