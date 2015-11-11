import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Krystian Szewczyk on 2015-11-11.
 */
public class ProductManagerTest {
    ProductManager pm = new ProductManager();

    //koment
    @Test
    public void checkConnection() {
        assertNotNull(pm.getConn());
    }
}
