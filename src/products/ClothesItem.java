package products;

import errors.InvalidQuantityException;
import models.ItemModel;

import java.util.Scanner;

public class ClothesItem  extends ItemModel  {
    public ClothesItem  () {
    }

    private String color, brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getItemDetails () {
        return super.getItemDetails() + ", Warna pakaian: " + this.getColor() + ", brand pakaian: " + this.getBrand();
    }

    @Override
    public ItemModel inputItem() throws InvalidQuantityException {
        super.inputItem();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan warna: ");
        this.setColor(scanner.nextLine());
        System.out.print("Masukkan brand: ");
        this.setBrand(scanner.nextLine());
        return this;
    }
}
