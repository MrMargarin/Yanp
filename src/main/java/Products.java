import java.util.ArrayList;

/**
 * Created by Dmitrey on 23.01.2016.
 */
public class Products {

    private String categName;
    private ArrayList<Product> products;

    Products()
    {
        setCategName("someCategory");
        setProducts(new ArrayList<Product>());
    }

    Products(String categName)
    {
        setCategName(categName);
        setProducts(new ArrayList<Product>());
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getCategName() {
        return categName;
    }

    public void setCategName(String categName) {
        this.categName = categName;
    }

}
