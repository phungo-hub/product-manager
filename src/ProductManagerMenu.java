import java.util.Scanner;

public class ProductManagerMenu {
    public void displayMenu() {
        System.out.println("Product Manager Menu...");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Remove");
        System.out.println("4. Display All");
        System.out.println("5. Search a product by ID");
        System.out.println("6. Sort by Name");
    }

    public void menu() {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt(); scanner.nextLine();
            switch (choice) {
                case 1:
                    productManager.add(newProduct());
                    break;
                case 2:
                    Product pToUpdate = newProduct();
                    productManager.update(pToUpdate.getId(), pToUpdate);
                    break;
                case 3:
                    System.out.println("Input id to remove");
                    int idToRemove = scanner.nextInt(); scanner.nextLine();
                    productManager.remove(idToRemove);
                case 4:
                    productManager.displayAll();
                    break;
                case 5:
                    System.out.println("Input ID to search");
                    int idToSearch = scanner.nextInt(); scanner.nextLine();
                    productManager.searchById(idToSearch);
                    break;
                case 6:
                    System.out.println("Input Name to search");
                    productManager.sortByName();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public Product newProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input product Id");
        int productID = scanner.nextInt(); scanner.nextLine();
        System.out.println("Please input product Name");
        String productName = scanner.nextLine();

        Product newP = new Product(productID, productName);
        return newP;

    }
}
