import warehouse_items.*;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(1, "TV");
        Electronics electronics2 = new Electronics(2, "TV");
        Groceries groceries = new Groceries(2, "Golf");
        Groceries groceries2 = new Groceries(3, "Golf");
        Furniture furniture = new Furniture(3, "Furniture");
        Furniture furniture2 = new Furniture(4, "Furniture");


        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(electronics);
        electronicsStorage.addItem(electronics2);
        groceriesStorage.addItem(groceries);
        groceriesStorage.addItem(groceries2);
        furnitureStorage.addItem(furniture);
        furnitureStorage.addItem(furniture2);


        Storage.displayStorageItems(electronicsStorage.getItems());
    }
}