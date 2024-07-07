package models;

import errors.InvalidQuantityException;

import java.util.Scanner;

public class ItemModel extends ItemImplements {
    private String name, category;
    private int quantity;
    private boolean itemStatus;

    public ItemModel(String name, String category, int quantity, boolean status) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException("Jumlah barang tidak boleh negatif");
        }
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }
    public ItemModel () {

    }

    @Override
    public ItemModel inputItem() throws InvalidQuantityException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        this.setName(scanner.nextLine());

        System.out.print("Masukkan Jumlah barang: ");
        this.setQuantity(scanner.nextInt());

        System.out.print("Masukkan Status barang (true untuk tersedia, false untuk dipinjam): ");
        this.setItemStatus(scanner.nextBoolean());
        return this;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException("Jumlah barang tidak boleh negatif");
        }
        this.quantity = quantity;
    }

    public boolean isItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(boolean itemStatus) {
        this.itemStatus = itemStatus;
    }
    public String getStatus() {
        return this.isItemStatus() ? "Tersedia" : "Sedang dipinjam";
    }

    public String getItemDetails() {
        return "Nama barang: " + this.name + ", kategori barang: " + this.category + ", Jumlah barang : " + this.quantity + ", Status : " + this.getStatus();
    }
}
