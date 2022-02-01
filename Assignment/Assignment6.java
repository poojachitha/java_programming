package Assignment;

import java.util.*;

public class Assignment6 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(11, "Chicken Biryani", 170, 1));
        items.add(new Item(12, "Chicken 65", 100, 2));
        items.add(new Item(13, "Chicken Manchurian", 85, 1));

        Order order = new Order(1, "Hani", items);
        order.displayOrder();

    }

}

// class OrderProcessing {
// public void

// }

class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;
    private double netPrice;

    public Order(int orderId, String customerName, List<Item> items) {
        this.setOrderId(orderId);
        this.setCustomerName(customerName);
        this.setItems(items);
        this.setNetPrice(0);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public void displayOrder() {
        System.out.format("Order Id: %d ******************************* Customer Name: %s %n" + orderId, customerName);
        System.out.format("Items ====================================== %n");
        for (Item item : items) {
            System.out.format("%d %s %f %d" + item.getItemCode(), item.getItemName(), item.getUnitPrice(),
                    item.getQuantity(), item.getTotalPrice());
        }
        System.out.format(" ********************************************* %n");
        System.out.format("Net price: %f" + netPrice);

    }

}

class Item {
    private int itemCode;
    private String itemName;
    private double unitPrice;
    private int quantity;
    private double totalPrice;

    public Item(int itemCode, String itemName, double unitPrice, int quantity) {
        this.itemCode = itemCode;
        this.setItemName(itemName);
        this.setUnitPrice(unitPrice);
        this.setQuantity(quantity);
        this.totalPrice = quantity * unitPrice;

    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}