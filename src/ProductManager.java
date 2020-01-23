import javax.naming.spi.ObjectFactoryBuilder;
import java.util.ArrayList;

public class ProductManager {
    public ArrayList<Object> productManager = new ArrayList<>();
    public ProductManager(){
        this.productManager = new ArrayList<>();
    }

    public void addProduct(Object product) {
        productManager.add(product);
    }

    public void addProduct(int index, Object product) {
        productManager.add(index, product);
    }

    public void deleteProduct(int index) {
        productManager.remove(index);
    }

    public void deleteProduct(Object product) {
        if (productManager.isEmpty()) {
            System.out.println("list is empty");
        } else if (!productManager.contains(product)) {
            System.out.println("this product is not have in list");
        } else {
            productManager.remove(product);
        }
    }

    public void changeProduct(int index, String product) {
        deleteProduct(index);
        addProduct(index, product);
    }

    @Override
    public String toString() {
        return
                 productManager+" " ;
    }

    public static void main(String[] args) {
        Product product1 = new Product(1,"Nokia");
        Product product2 = new Product(2,"Iphone");
        Product product3 = new Product(3,"Oppo");
        ProductManager myList = new ProductManager();
          myList.addProduct(product1);
          myList.addProduct(product2);
          myList.addProduct(product3);
        System.out.println(myList.toString());
    }
}