package priceboard;

/**
 * This class represents a company.
 */
public class Company{
    private String name;
    private Product item;

    public Company(String companyName){
        this.name = companyName;
    }

    /**
     * This method creates a new Product object owned by the company.
     * @param productName String representing a Product name
     * @param id Integer representing a product ID number.
     * @param price Double representing a Product's price.
     */
    public void createProduct(String productName, int id, double price){
        this.item = new Product(productName, id, price);
    }

    /**
     * Getter for company name.
     */
    public String getCompanyName(){
        return this.name;
    }

    /**
     * Getter for company item.
     */
    public Product getItem(){
        return this.item;
    }

    @Override
    public String toString(){
        return this.name + "|" + this.item;
    }
}