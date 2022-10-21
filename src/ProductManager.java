import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList();

    public void add(Product p) {
        products.add(p);
    }

    public void update(int id, Product newProduct) {
        if (isInArray(id)) {
            for (Product p: products) {
                if (id == p.getId()) {
                    p.setName(newProduct.getName());
                }
            }
        } else {
            System.out.println("system doesn't have products");
        }
    }

    public void remove(int id) {
        Product p = searchById(id);
        if (p != null)
            products.remove(p);
        else {
            System.out.println("Không tim thấy sản phẩm");
        }
    }

    public void displayAll() {
        System.out.println(products);
    }

    public Product searchById(int id) {
        if (isInArray(id)) {
            for (Product p: products) {
                if (id == p.getId()) {
                    System.out.println(p);
                    return p;
                }
            }
        }
        System.out.println("system doesn't have products");
        return null;
    }

    public boolean isInArray(int id) {
        for (Product p: products) {
            if (id == p.getId())
                return true;
        }
        return false;
    }

    public void sortByName() {
        Collections.sort(products);
    }
}
