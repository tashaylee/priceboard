package tests;

import priceboard.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PriceBoardTest{
    
    PriceBoard board;
    Company company;

    public PriceBoardTest(){
        board = PriceBoard.getPriceBoardInstance();
        company = new Company("Krusty Krab");
        company.createProduct("krabby patty", 1001, 12.00);
    }

    @Test
    public void testGetPriceBoardInstance(){
        assertTrue(board instanceof PriceBoard);
    }
    
    @Test
    public void testCreateEntry(){
        // create an entry
        board.createEntry(this.company);

        // get first entry from PriceBoard
        for(BoardEntry entry: board.getAllBoardEntries()){
            entry.addHistPrice();
        }
        BoardEntry entry1 = board.getAllBoardEntries().get(0);
        assertEquals(12.00, entry1.getHistoricalPrice().getPrevPrice(), 0);
    }

    @Test
    public void testUpdateEntry(){
        board.createEntry(this.company);
        company.getItem().setProductPrice(1.99);
        board.updateEntry(company);
        assertEquals(12.00, company.getItem().getProductPrice(), 0);
    }

    @Test
    public void testGetAllBoardEntries(){
        assertTrue(board.getAllBoardEntries() instanceof ArrayList);
    }
    
}