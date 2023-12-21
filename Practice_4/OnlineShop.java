package Practice_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Category {
    ELECTRONICS,
    CLOTHING,
    BEAUTY,
    BOOKS
}

class Product {
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
class ShoppingCart {
    private List<Product> products;
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product:products) {
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
    public void emptyCart() {
        products.clear();
    }
    public void displayCart() {
        System.out.println("Shopping cart: ");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total price: $" + calculateTotalPrice());
    }
}
class User {
    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
public class OnlineShop {
    private List<Product> catalog;
    private List<User> users;
    private User loggedInUser;
    private ShoppingCart cart;
    public OnlineShop() {
        this.catalog = new ArrayList<>();
        this.users = new ArrayList<>();
        this.cart = new ShoppingCart();
    }
    public void run() {
        initializeCatalog();
        initializeUsers();
        login();
        if (loggedInUser != null) {
            displayCategories();
            chooseCategory();
            displayProductsFromCategory();
            chooseProduct();
            buyProducts();
            cart.displayCart();
        }
    }
    private void initializeCatalog() {
        catalog.add(new Product("iPhone 12", 1000.00, Category.ELECTRONICS));
        catalog.add(new Product("Samsung Galaxy S21", 899.99, Category.ELECTRONICS));
        catalog.add(new Product("Nike Air Max", 129.99, Category.CLOTHING));
        catalog.add(new Product("MacBook Pro", 1499.99, Category.ELECTRONICS));
        catalog.add(new Product("Dior Perfume", 179.99, Category.BEAUTY));
        catalog.add(new Product("Harry Potter and the Sorcerer's Stone", 9.99, Category.BOOKS));
    }
    private void initializeUsers() {
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
    }
    private void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for(User user:users) {
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)) {
                loggedInUser = user;
                break;
            }
        }
        if(loggedInUser == null) {
            System.out.println("Invalid username or password.");
            System.out.println("Existing the program...");
            System.exit(0);
        }
    }
    private void displayCategories() {
        System.out.println("Categories: ");
        for(Category category:Category.values()) {
            System.out.println("-" + category.name());
        }
    }
    private void chooseCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category number: ");
        int categoryNumber = scanner.nextInt();
        Category chosenCategory = Category.values() [categoryNumber - 1];
        for(Product product:catalog) {
            if(product.getCategory() == chosenCategory) {
                cart.addProduct(product);
            }
        }
    }
    private void displayProductsFromCategory() {
        System.out.println("Products: ");
        for(Product product : cart.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
    private void chooseProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the product you want to buy: ");
        int productNumber = scanner.nextInt();

        Product chosenProduct = cart.getProducts().get(productNumber - 1);
        cart.addProduct(chosenProduct);
    }
    private void buyProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity - 1; i++) {
            cart.addProduct(cart.getProducts().get(cart.getProducts().size() - 1));
        }
    }

    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();
        onlineShop.run();
    }
}