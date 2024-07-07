package products;

import errors.InvalidQuantityException;
import models.ItemModel;

import java.util.Scanner;

public class ElectronicItem extends ItemModel {
    public ElectronicItem(String name, String category, int quantity, boolean status, int warrantyPeriod) throws InvalidQuantityException {
        super(name, category, quantity, status);
        this.warrantyPeriod = warrantyPeriod;
    }
    public ElectronicItem () {

    }

    private int warrantyPeriod;

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    @Override
    public String getItemDetails () {
        return super.getItemDetails() + ", Periode garansi: " + this.getWarrantyPeriod() + " bulan";
    }

    @Override
    public ItemModel inputItem() throws InvalidQuantityException {
        super.inputItem();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan periode garansi: ");
        this.setWarrantyPeriod(scanner.nextInt());
        return this;
    }
}
