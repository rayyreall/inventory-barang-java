package services;

import errors.InvalidQuantityException;
import models.ItemModel;
import products.ElectronicItem;

import java.util.ArrayList;

public class InventoryService {
    private static InventoryService instance = null;
    private ArrayList<ItemModel> items = new ArrayList<>();

    private InventoryService () {
        this.items = new ArrayList<>();
    }
    public static InventoryService getInstance () {
        if  (instance == null) {
            instance = new InventoryService();
        }
        return instance;
    }
    public void addItem(ItemModel item) {
        this.items.add(item);
    }
    public void addItem(String name, String category, int quantity, boolean status) {
        try {
            ItemModel item = new ItemModel(name, category, quantity, status);
            this.items.add(item);
        } catch (InvalidQuantityException e) {
            System.out.println("[ERROR] menambahkan barang : " + e.getMessage());
        }
    }
    public void addItem (String name, String category, int quantity, boolean status, int warrantyPeriod) {
        try {
            ElectronicItem electronicItem = new ElectronicItem(name, category, quantity, status, warrantyPeriod);
            this.items.add(electronicItem);
        } catch (InvalidQuantityException e) {
            System.out.println("[ERROR] menambahkan barang elektronik : " + e.getMessage());
        }
    }
    public void displayItems() {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println("Item " + (i+1) + ":");
            System.out.println(this.items.get(i).getItemDetails());
        }
    }
}
