/**
 * Created by Krystian Szewczyk on 2015-11-11.
 */
public class Product {
    private int idProduct;
    private String productName;
    private String productDescription;
    private double price;

    public Product (){
    }

    public Product (int idProduct, String productName, String productDescription, double price){
        super();

        this.idProduct = idProduct;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public int getIdProduct () { return idProduct; }
    public void setIdProduct (int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName () { return productName; }
    public void setProductName (String productName){
        this.productName = productName;
    }

    public String getProductDescription () { return productDescription; }
    public void setProductDescription (String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice () { return price; }
    public void setPrice(double price) {
        this.price = price;
    }
}
