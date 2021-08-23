package tests;

import priceboard.*;
import static org.junit.Assert.*;
import java.util.Stack;
import org.junit.Test;
public class BoardEntryTest {

    BoardEntry entry;
    Company company; 
    Product prod;
    
    public BoardEntryTest(){
        company = new Company("IHOP");
        company.createProduct("pancakes", 1234, 7.99);
        entry = new BoardEntry(company);
    }

    @Test
    public void addHistPriceTest(){
        entry.addHistPrice();
        entry.getCompanyFromEntry().getItem().setProductPrice(10.99);
        entry.getCompanyFromEntry().getItem().saveCurrentPrice();
        entry.addHistPrice();
        assertEquals(2, entry.getPriceHistoryStack().size());
    }

    @Test
    public void getHistoricalPriceTest(){
        entry.addHistPrice();
        assertEquals(7.99, entry.getHistoricalPrice().getPrevPrice(),0);
    }

    @Test
    public void removeHistPriceTest(){
        entry.addHistPrice();
        entry.removeHistPrice();
        assertTrue(entry.getPriceHistoryStack().empty());
    }

    @Test
    public void getCompanyFromEntryTest(){
        assertEquals(company, entry.getCompanyFromEntry());
    }

    @Test
    public void getPriceHistoryTest(){
        assertTrue(entry.getPriceHistoryStack() instanceof Stack);
    }
}
