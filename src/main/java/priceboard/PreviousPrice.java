package priceboard;

/**
 * This class represents an entity's last price.
 */
public class PreviousPrice implements HistoricalPrice{
    private double productPrice;

    public PreviousPrice(double productPrice){
        this.productPrice = productPrice;
    }

    /**
     * This method changes a Product's price back to its previous price.
     * @param product Product object representing a single product.
     */
    public void restorePrevPrice(Product product){
        product.setProductPrice(productPrice);
    }

    /**
     * Getter for the previous price.
     * @return Double representing an entity's previous price.
     */
    public double getPrevPrice(){
        return this.productPrice;
    }

    @Override
    public String toString(){
        return Double.toString(this.productPrice);
    }
}