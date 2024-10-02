package tegh.chillo;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
//    No-Arg Constructor
    public Product() {
//        System.out.println("Constructor it's created");
        this.name = "No Name";
        this.description = "No Description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0.0f;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
    }
// Parametrize Constructor
    public Product(String name , String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
//        System.out.println("constructor 5 values");
    }
//constructor chaining
    public Product(String name , String description, float price, int quantity, float discount , String color) {
     this(name, description, price, quantity, discount);
     this.color = color;
//     System.out.println("constructor 6 values");
    }

//    Copy constructor
    public Product(Product obj){
        this(obj.name, obj.description , obj.price, obj.quantity, obj.discount);
    }
}
