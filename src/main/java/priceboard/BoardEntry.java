package priceboard;
import java.util.*;

/**
 * This class represents a single entry on the price board.
 */
public class BoardEntry{
    private Company company;
    private Stack<HistoricalPrice> priceHistoryStack;

    public BoardEntry(Company company){
        this.company = company;
        this.priceHistoryStack = new Stack<HistoricalPrice>();
    }

    /**
     * This method adds an entity's current price to the priceHistoryStack stack
     * and saves it as a reference to the entity's previous price.
     */
    public void addHistPrice(){
        PreviousPrice histPrice = this.company.getItem().saveCurrentPrice();
        priceHistoryStack.push(histPrice);
    }

    /**
     * This method retrieves an entity's most recent previous price 
     * from the priceHistoryStack stack.
     * @return HistoricalPrice object representing an entity's most recent price listing.
     */
    public HistoricalPrice getHistoricalPrice(){
        return priceHistoryStack.peek();
    }

    /**
     * This method removes an entity's most recent previous price listing.
     */
    public void removeHistPrice(){
        priceHistoryStack.pop();
    }

    /**
     * This method gets the company object that the board entry represents.
     * @return
     */
    public Company getCompanyFromEntry(){
        return this.company;
    }

    /**
     * This method gets the priceHistoryStack Stack that contains all previous prices
     * for an entity.
     * @return HistoricalPrice object
     */
    public Stack<HistoricalPrice> getPriceHistoryStack(){
        return this.priceHistoryStack;
    }

    @Override
    public String toString(){
        return getCompanyFromEntry().toString();
    }
}