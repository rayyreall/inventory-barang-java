package apps;

import errors.InvalidQuantityException;
import models.ItemModel;
import products.ClothesItem;
import products.ElectronicItem;
import services.InventoryService;

import java.util.Scanner;

public class InventoryManagementApp {
    public static void main(String[] args) {

            while (true) {
                try {
                    InventoryService inventory = InventoryService.getInstance();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("1. Tambah Barang");
                    System.out.println("2. Menampilkan barang");
                    System.out.println("3. Exit");

                    System.out.print("Masukkan pilihan  (1-3): ");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            ItemModel item = choiceItem();
                            inventory.addItem(item);
                            break;
                        case 2:
                            System.out.println();
                            System.out.println();
                            System.out.println("List barang: ");
                            inventory.displayItems();
                            break;
                        case 3:
                            System.out.println("Program selesai!");
                            return;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                }   catch (InvalidQuantityException e) {
                     System.out.println("Jumlah barang tidak valid");
                } catch (Exception e) {
                    System.out.println("Inputan anda tidak valid");
                }

            }
    }
    private static ItemModel choiceItem () throws InvalidQuantityException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kategori barang: ");
        String category = scanner.nextLine();
        if (category.toLowerCase().equals("elektronik")) {
            return new ElectronicItem().inputItem();
        } else if (category.toLowerCase().equals("pakaian")) {
            return new ClothesItem().inputItem();
        }else {
            return new ItemModel().inputItem();
        }
    }
}
