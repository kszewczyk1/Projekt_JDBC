/**
 * Created by Krystian Szewczyk on 2015-11-11.
 */
public class Provider {
    private int idProvider;
    private String providerName;

    public Provider (){
    }

    public Provider (String providerName){
        super();

        this.providerName = providerName;
    }

    public int getIdProvider() { return idProvider; }
    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
