# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini dirancang untuk mengelola data inventaris, termasuk penambahan, penghapusan, dan pengelolaan stok barang. Aplikasi ini juga dapat mengelompokkan barang berdasarkan jenisnya, seperti pakaian dan barang elektronik.

Aplikasi ini mengimplementasikan berbagai konsep dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Exception Handling, dan lain-lain.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. Class adalah template atau blueprint dari object. Pada kode ini, ItemModel, ItemImplements, ClothesItem, ElectronicItem, dan InventoryService adalah contoh dari class.

```bash
public class ItemModel {
    ...
}

public class ClothesItem extends ItemModel {
    ...
}

public class ElectronicItem extends ItemModel {
    ...
}

public class InventoryService {
    ...
}

```

2. **Object**  adalah instance dari class. Pada kode ini, `new ClothesItem()`, `new ElectronicItem()`, dan `new InventoryService()` adalah contoh pembuatan object.

```bash
ItemModel item1 = new ClothesItem("Jeans", 10);
ItemModel item2 = new ElectronicItem("Laptop", 5);
InventoryService inventoryService = new InventoryService();

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `name`, `quantity`, `items` adalah contoh atribut.

```bash
private String name;
private int quantity;
private List<ItemModel> items;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `ItemModel`, `ClothesItem`, `ElectronicItem`, dan `InventoryService`.

```bash
public ItemModel(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
}

public ClothesItem(String name, int quantity) {
    super(name, quantity);
}

public ElectronicItem(String name, int quantity) {
    super(name, quantity);
}

public InventoryService() {
    items = new ArrayList<>();
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setQuantity adalah contoh method mutator.

```bash
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getName` dan `getQuantity` adalah contoh method accessor.

```bash
public String getName() {
    return name;
}

public int getQuantity() {
    return quantity;
}

```

7. **Encapsulation** adalahkonsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `name` dan `quantity` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String name;
private int quantity;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ClothesItem` dan `ElectronicItem` mewarisi `ItemModel` dengan sintaks `extends`.

```bash
public class ClothesItem extends ItemModel {
    ...
}

public class ElectronicItem extends ItemModel {
    ...
}

```

9. Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi.

```bash
public void addItem(ItemModel item) {
    items.add(item);
}

@Override
public String displayInfo() {
    return "Item: " + getName() + ", Quantity: " + getQuantity();
}


```

10. **Seleksi** adalah Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Proyek ini menggunakan seleksi if-else dan switch dalam beberapa bagian kode.

```bash
public void updateItemQuantity(String name, int quantity) throws InvalidQuantityException {
    if (quantity < 0) {
        throw new InvalidQuantityException("Quantity cannot be negative");
    }
    
    for (ItemModel item : items) {
        if (item.getName().equals(name)) {
            item.setQuantity(quantity);
            return;
        }
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (ItemModel item : items) {
    System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
}

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama barang: ");
String itemName = scanner.nextLine();

System.out.println("Stok barang: " + item.getQuantity());

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
**ItemModel[] inventoryItems = new ItemModel[2];**
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    inventoryService.removeItem("Laptop", -5);
} catch (InvalidQuantityException e) {
    System.out.println("Error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("An unexpected error occurred: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rizki Firdaus
NPM: 2210010466
