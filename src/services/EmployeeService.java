package services;

import models.ItemModel;

import java.util.ArrayList;

public class EmployeeService {
    private String id, name;
    private ArrayList<ItemModel> borrowedItems = new ArrayList<ItemModel>();
    private EmployeeService (String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<ItemModel> getBorrowedItems() {
        return borrowedItems;
    }
    public void addBorrowedItems(ItemModel item) {
        this.borrowedItems.add(item);
    }
}
