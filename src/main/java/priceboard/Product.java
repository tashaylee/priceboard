package priceboard;

/**
 * This class represents a Company's Product.
 */
public class Product implements Originator{
    private String productName;
    private int id;
    private double price;

    public Product(String name, int id, double price){
        this.productName = name;
        this.id = id;
        this.price = price;
    }

    /**
     * This method saves a Product's current price.
     * @return PreviousPrice object representing the current price.
     */
    public PreviousPrice saveCurrentPrice(){
        return new PreviousPrice(this.price);
    }

    /**
     * Setters for a Product's current price.
     * @param price double representing a product price.
     */
    public void setProductPrice(double price){
        this.price = price;
    }

    /**
     * Getter for the Product's current price.
     * @return Double representing the Product's current price.
     */
    public double getProductPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return this.productName + "|" + this.id + "|" + this.price;
    }

}