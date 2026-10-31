
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ProductService productService =
                new ProductService();

        UserService userService =
                new UserService();

        CartService cartService =
                new CartService();

        OrderService orderService =
                new OrderService();

        loadProducts(productService);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("       ELECTROMART");
            System.out.println("==============================");

            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Register");
            System.out.println("4. Login");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    productService.showAllProducts();
                    break;

                case 2:
                    searchProduct(productService);
                    break;

                case 3:
                    userService.register(scanner);
                    break;

                case 4:

                    User user =
                            userService.login(scanner);

                    if (user != null) {

                        userMenu(
                                user,
                                productService,
                                cartService,
                                orderService
                        );
                    }

                    break;

                case 5:

                    System.out.println(
                            "Thank you for using ElectroMart!"
                    );

                    return;

                default:

                    System.out.println(
                            "Invalid option"
                    );
            }
        }
    }

    static void searchProduct(
            ProductService productService
    ) {

        System.out.print(
                "Enter product name: "
        );

        String keyword =
                scanner.nextLine();

        productService.search(
                keyword
        );
    }

    static void userMenu(
            User user,
            ProductService productService,
            CartService cartService,
            OrderService orderService
    ) {

        while (true) {

            System.out.println(
                    "\nWelcome " +
                    user.getName()
            );

            System.out.println(
                    "1. View Products"
            );

            System.out.println(
                    "2. Add Product To Cart"
            );

            System.out.println(
                    "3. View Cart"
            );

            System.out.println(
                    "4. Remove From Cart"
            );

            System.out.println(
                    "5. Checkout"
            );

            System.out.println(
                    "6. My Orders"
            );

            System.out.println(
                    "7. Logout"
            );

            System.out.print(
                    "Choose: "
            );

            int choice =
                    scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    productService
                            .showAllProducts();

                    break;

                case 2:

                    cartService.addToCart(
                            scanner,
                            user,
                            productService
                    );

                    break;

                case 3:

                    cartService.showCart(
                            user
                    );

                    break;

                case 4:

                    cartService.removeFromCart(
                            scanner,
                            user
                    );

                    break;

                case 5:

                    orderService.checkout(
                            scanner,
                            user,
                            cartService,
                            productService
                    );

                    break;

                case 6:

                    orderService.showOrders(
                            user
                    );

                    break;

                case 7:

                    System.out.println(
                            "Logged out."
                    );

                    return;

                default:

                    System.out.println(
                            "Invalid option"
                    );
            }
        }
    }

    static void loadProducts(
            ProductService productService
    ) {

        productService.addProduct(
                new Product(
                        101,
                        "Samsung Galaxy S24",
                        "Mobile",
                        74999,
                        10
                )
        );

        productService.addProduct(
                new Product(
                        102,
                        "iPhone 15",
                        "Mobile",
                        69999,
                        8
                )
        );

        productService.addProduct(
                new Product(
                        103,
                        "Dell Inspiron 15",
                        "Laptop",
                        55999,
                        12
                )
        );

        productService.addProduct(
                new Product(
                        104,
                        "HP Pavilion",
                        "Laptop",
                        62999,
                        7
                )
        );

        productService.addProduct(
                new Product(
                        105,
                        "Sony Bravia 55",
                        "Television",
                        79999,
                        5
                )
        );

        productService.addProduct(
                new Product(
                        106,
                        "Boat Rockerz 450",
                        "Headphones",
                        1499,
                        25
                )
        );

        productService.addProduct(
                new Product(
                        107,
                        "Canon EOS 1500D",
                        "Camera",
                        42999,
                        6
                )
        );

        productService.addProduct(
                new Product(
                        108,
                        "Apple Watch SE",
                        "Smart Watch",
                        29999,
                        9
                )
        );

        productService.addProduct(
                new Product(
                        109,
                        "JBL Bluetooth Speaker",
                        "Speaker",
                        4999,
                        15
                )
        );

        productService.addProduct(
                new Product(
                        110,
                        "Logitech Wireless Mouse",
                        "Accessories",
                        899,
                        30
                )
        );
        }

        static class Product {
                final int id;
                final String name;
                final String category;
                final double price;
                int stock;

                Product(int id, String name, String category, double price, int stock) {
                        this.id = id;
                        this.name = name;
                        this.category = category;
                        this.price = price;
                        this.stock = stock;
                }
        }

        static class User {
                private final String name;
                private final String username;
                private final String password;
                final List<Product> cart = new ArrayList<>();
                final List<String> orders = new ArrayList<>();

                User(String name, String username, String password) {
                        this.name = name;
                        this.username = username;
                        this.password = password;
                }

                String getName() {
                        return name;
                }
        }

        static class ProductService {
                private final List<Product> products = new ArrayList<>();

                void addProduct(Product product) {
                        products.add(product);
                }

                void showAllProducts() {
                        for (Product product : products) {
                                System.out.printf("%d. %s (%s) - %.2f | Stock: %d%n",
                                                product.id, product.name, product.category,
                                                product.price, product.stock);
                        }
                }

                void search(String keyword) {
                        boolean found = false;
                        for (Product product : products) {
                                if (product.name.toLowerCase().contains(keyword.toLowerCase())) {
                                        System.out.printf("%d. %s - %.2f | Stock: %d%n",
                                                        product.id, product.name, product.price, product.stock);
                                        found = true;
                                }
                        }
                        if (!found) {
                                System.out.println("No products found.");
                        }
                }

                Product find(int id) {
                        for (Product product : products) {
                                if (product.id == id) {
                                        return product;
                                }
                        }
                        return null;
                }
        }

        static class UserService {
                private final Map<String, User> users = new HashMap<>();

                void register(Scanner input) {
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        System.out.print("Username: ");
                        String username = input.nextLine();
                        if (users.containsKey(username)) {
                                System.out.println("Username already exists.");
                                return;
                        }
                        System.out.print("Password: ");
                        String password = input.nextLine();
                        users.put(username, new User(name, username, password));
                        System.out.println("Registration successful.");
                }

                User login(Scanner input) {
                        System.out.print("Username: ");
                        String username = input.nextLine();
                        System.out.print("Password: ");
                        String password = input.nextLine();
                        User user = users.get(username);
                        if (user != null && user.password.equals(password)) {
                                return user;
                        }
                        System.out.println("Invalid username or password.");
                        return null;
                }
        }

        static class CartService {
                void addToCart(Scanner input, User user, ProductService service) {
                        System.out.print("Enter product ID: ");
                        Product product = service.find(input.nextInt());
                        input.nextLine();
                        if (product == null || product.stock < 1) {
                                System.out.println("Product unavailable.");
                                return;
                        }
                        user.cart.add(product);
                        product.stock--;
                        System.out.println("Product added to cart.");
                }

                void showCart(User user) {
                        if (user.cart.isEmpty()) {
                                System.out.println("Cart is empty.");
                                return;
                        }
                        double total = 0;
                        for (Product product : user.cart) {
                                System.out.printf("%s - %.2f%n", product.name, product.price);
                                total += product.price;
                        }
                        System.out.printf("Total: %.2f%n", total);
                }

                void removeFromCart(Scanner input, User user) {
                        showCart(user);
                        if (user.cart.isEmpty()) {
                                return;
                        }
                        System.out.print("Enter product ID: ");
                        int id = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < user.cart.size(); i++) {
                                if (user.cart.get(i).id == id) {
                                        user.cart.get(i).stock++;
                                        user.cart.remove(i);
                                        System.out.println("Product removed.");
                                        return;
                                }
                        }
                        System.out.println("Product is not in the cart.");
                }
        }

        static class OrderService {
                void checkout(Scanner input, User user, CartService cart, ProductService products) {
                        if (user.cart.isEmpty()) {
                                System.out.println("Cart is empty.");
                                return;
                        }
                        cart.showCart(user);
                        System.out.print("Confirm checkout (yes/no): ");
                        if (input.nextLine().equalsIgnoreCase("yes")) {
                                double total = 0;
                                for (Product product : user.cart) {
                                        total += product.price;
                                }
                                user.orders.add(String.format("Order total: %.2f", total));
                                user.cart.clear();
                                System.out.println("Order placed successfully.");
                        }
                }

                void showOrders(User user) {
                        if (user.orders.isEmpty()) {
                                System.out.println("No orders found.");
                                return;
                        }
                        for (String order : user.orders) {
                                System.out.println(order);
                        }
                }
        }
}
