import java.util.ArrayList;
import java.util.Iterator;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 1000, 2);
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
