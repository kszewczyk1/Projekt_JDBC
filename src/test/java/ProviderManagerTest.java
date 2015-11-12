import org.junit.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Krystian Szewczyk on 2015-11-12.
 */
public class ProviderManagerTest {
    ProviderManager pm = new ProviderManager();
    Provider p = new Provider("Przykładowy dostawca");
    private String provider1 = "Dostawca1";
    private String provider2 = "Dostawca2";

    @Test
    public void checkConn() { assertNotNull(pm.getConn()); }

    @Test
    public void checkAddProvider(){
        assertEquals(1, pm.addProvider(p));
    }

    @Test
    public void checkDeleteProvider(){
        pm.addProvider(p);

        List<Provider> providerList = pm.getAllProviders();
        int i = providerList.size();

        pm.deleteProvider(providerList.get(0).getIdProvider());
        providerList = pm.getAllProviders();
        assertEquals(i-1,providerList.size());
    }

    @Test
    public void checkUpdateProvider(){
        Provider p = new Provider(provider1);

        assertEquals(1, pm.addProvider(p));

        List<Provider> pl = pm.getAllProviders();
        Provider p1 = pl.get(0);

        p1.setProviderName(provider2);

        assertEquals(1, pm.updateProvider(p1));

        List<Provider> pl2 = pm.getAllProviders();
        Provider p2 = pl2.get(0);

        assertEquals(provider2, p2.getProviderName());
        assertEquals(p2.getIdProvider(), p2.getIdProvider());
    }
}
