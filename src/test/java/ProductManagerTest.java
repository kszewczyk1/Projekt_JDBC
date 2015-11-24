import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductManagerTest {
    ProductManager pm = new ProductManager();
    ProviderManager pm1 = new ProviderManager();

    Product p = new Product(1, "Nazwa", "Opis", 3.0);
    Provider p1 = new Provider("Dostawca");
    private int id1 = 1;
    private int id2 = 2;
    private String product1 = "Product1";
    private String product2 = "Product2";
    private String desc1 = "Description1";
    private String desc2 = "Description2";
    private double price1 = 1.0;
    private double price2 = 2.0;

    @Test
    public void checkConn() {
        assertNotNull(pm.getConn());
    }

    @Test
    public void checkAddProduct(){
        assertEquals(1, pm.addProduct(p));
    }

    @Test
    public void checkDeleteProduct(){
        pm.addProduct(p);

        List<Product> productList = pm.getAllProducts();
        int i = productList.size();

        pm.deleteProduct(productList.get(0).getIdProduct());
        productList = pm.getAllProducts();
        assertEquals(i-1,productList.size());
    }

    @Test
    public void checkGetAllProvidersByProducts(){
        pm1.addProvider(p1);
        pm.addProduct(p);

        List<Provider> pl = pm.getAllProvidersByProducts(p);
        Provider p1 = pl.get(0);

        assertEquals(1, p1.getIdProvider());
        assertEquals("Dostawca2", p1.getProviderName());
    }

    @Test
    public void checkDeleteAllProductsByProvider(){
        pm1.addProvider(p1);
        pm.addProduct(p);

        assertEquals(1, pm.deleteAllProductsByProvider(p1));
    }

}
