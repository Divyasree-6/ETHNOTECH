import java.util.Scanner;
abstract class FoodOrder {
    String customerName;
    String address;
    String foodItem;
    int itemNo;
    double price;
    int quantity;
    FoodOrder() {
        System.out.println("=== Welcome to the Food Delivery System ===");
    }
    FoodOrder(String name, String address, String foodItem, int itemNo, double price, int quantity) {
        this.customerName = name;
        this.address = address;
        this.foodItem = foodItem;
        this.itemNo = itemNo;
        this.price = price;
        this.quantity = quantity;
    }

    abstract void processOrder();

    void showOrderDetails() {
        System.out.println("\n--- Order Receipt ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Delivery Address : " + address);
        System.out.println("Item ID         : " + itemNo);
        System.out.println("Item Name       : " + foodItem);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Unit Price      : " + price);
        
        double totalCost = price * quantity;
        double discountedPrice = totalCost / 1.5; 
        System.out.printf("Final Price (After Discount): %.2f\n", discountedPrice);
    }
}

class Biryani extends FoodOrder {
    Biryani(String name, String addr) {
        super(name, addr, "Biryani", 1, 100.0, 2);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Biryani confirmed successfully!");
    }
}

class Idly extends FoodOrder {
    Idly(String name, String addr) {
        super(name, addr, "Idly", 2, 40.0, 3);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Idly confirmed successfully!");
    }
}

class Chapathi extends FoodOrder {
    Chapathi(String name, String addr) {
        super(name, addr, "Chapathi", 3, 40.0, 1);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Chapathi confirmed successfully!");
    }
}

class Puri extends FoodOrder {
    Puri(String name, String addr) {
        super(name, addr, "Puri", 4, 20.0, 2);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Puri confirmed successfully!");
    }
}

class Maggie extends FoodOrder {
    Maggie(String name, String addr) {
        super(name, addr, "Maggie", 5, 25.0, 1);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Maggie confirmed successfully!");
    }
}

class EggRice extends FoodOrder {
    EggRice(String name, String addr) {
        super(name, addr, "Egg Rice", 6, 60.0, 5);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Egg Rice confirmed successfully!");
    }
}

class Paneer extends FoodOrder {
    Paneer(String name, String addr) {
        super(name, addr, "Paneer", 7, 99.0, 2);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Paneer confirmed successfully!");
    }
}

class Burger extends FoodOrder {
    Burger(String name, String addr) {
        super(name, addr, "Burger", 8, 89.0, 3);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Burger confirmed successfully!");
    }
}

class Palav extends FoodOrder {
    Palav(String name, String addr) {
        super(name, addr, "Palav", 9, 60.0, 1);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Palav confirmed successfully!");
    }
}

class IceCream extends FoodOrder {
    IceCream(String name, String addr) {
        super(name, addr, "Ice Cream", 10, 55.0, 2);
    }

    @Override
    void processOrder() {
        System.out.println("Order for Ice Cream confirmed successfully!");
    }
}

class MainApplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("============= MENU =============");
        System.out.println("1. Biryani\n2. Idly\n3. Chapathi\n4. Puri\n5. Maggie");
        System.out.println("6. Egg Rice\n7. Paneer\n8. Burger\n9. Palav\n10. Ice Cream");
        System.out.println("================================");
        System.out.print("Select your item number: ");

        int selection = inputScanner.nextInt();
        FoodOrder order = null;

        
        switch (selection) {
            case 1:  order = new Biryani("Navya", "Puttaparthi"); break;
            case 2:  order = new Idly("priya", "Bangalore"); break;
            case 3:  order = new Chapathi("Nandhu", "Tamil Nadu"); break;
            case 4:  order = new Puri("krithi", "Kerala"); break;
            case 5:  order = new Maggie("chaithra", "Hyderabad"); break;
            case 6:  order = new EggRice("ammu", "Chennai"); break;
            case 7:  order = new Paneer("Divya", "Delhi"); break;
            case 8:  order = new Burger("Sita", "Mumbai"); break;
            case 9:  order = new Palav("tira", "Pune"); break;
            case 10: order = new IceCream("Anu", "Goa"); break;
            default: System.out.println("Invalid Selection. Item Not Found!");
        }

        if (order != null) {
            order.showOrderDetails();
            order.processOrder();
        }
        
        inputScanner.close();
    }
}