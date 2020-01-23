import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Properties;

public class Product {
    public String nameProduct;
    public int id;

    public Product(int id, String name) {
        this.id = id;
        this.nameProduct = name;
    }

    public int getId() {
        return this.id;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "[Name Product:" + nameProduct + ",ID=" + id + "]";
    }
}

