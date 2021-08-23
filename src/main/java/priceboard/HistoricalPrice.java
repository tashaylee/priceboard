package priceboard;

public interface HistoricalPrice{
    /**
     * This method changes an entity's price back to its previous price point.
     */
    public void restorePrevPrice(Product product);

    /**
     * This method gets an entity's price.
     * @return Double representing an entity's previous price.
     */
    public double getPrevPrice();
}