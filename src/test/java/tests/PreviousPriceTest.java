package tests;

import priceboard.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PreviousPriceTest {

    Product product;
    PreviousPrice lp;
    
    public PreviousPriceTest(){
        product = new Product("pancakes", 1234, 7.99);
        //Product product2 = new Product("pancakes", 1234, 11.99);
        lp = new PreviousPrice(product.getProductPrice());
    }

    @Test
    public void restorePrevPriceTest(){
        product.setProductPrice(11.99);
        lp.restorePrevPrice(this.product);
        assertEquals(7.99, product.getProductPrice(), 0);
    }

}
