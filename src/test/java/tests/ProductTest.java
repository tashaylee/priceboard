package tests;

import priceboard.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class ProductTest {

    Product product;

    public ProductTest(){
        product = new Product("pancakes", 1234, 7.99);
    }

    @Test
    public void saveCurrentPriceTest(){
        assertTrue(product.saveCurrentPrice() instanceof PreviousPrice);
    }

    @Test
    public void getPriceTest(){
        assertEquals(7.99, this.product.getProductPrice(), 0);
    }

    @Test
    public void setProductPriceTest(){
        product.setProductPrice(15.99);
        assertEquals(15.99, product.getProductPrice(), 0);
    }
}
