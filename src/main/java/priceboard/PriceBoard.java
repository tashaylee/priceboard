package priceboard;

import java.util.ArrayList;

/**
 * This class represents a price board.
 */
public class PriceBoard{

    private static PriceBoard priceBoard = new PriceBoard();
    private ArrayList<BoardEntry> allBoardEntries = new ArrayList<BoardEntry>();

    private PriceBoard(){}

    public static PriceBoard getPriceBoardInstance(){
        return priceBoard;
    }

    /**
     * This method creates a new entry on the price board.
     * @param company Company containing a Product object.
     */
    public void createEntry(Company company){
        BoardEntry singleEntry = new BoardEntry(company);
        singleEntry.addHistPrice();
        addEntryToBoard(singleEntry);
    }

    /**
     * This method is a helper to createEntry().
     * This method adds an entry into the allBoardEntries array.
     * @param entry BoardEntry representing an entry on the price board.
     */
    private void addEntryToBoard(BoardEntry entry){
        allBoardEntries.add(entry);
    }

    /**
     * This method updates an entry on the price board.
     * @param company Company containing a product object.
     */
    public void updateEntry(Company company){
        for(BoardEntry entry : allBoardEntries) {
            if(entry.getCompanyFromEntry() == company) {
                // get the entry(representing a product) last price.
                entry.getHistoricalPrice().restorePrevPrice(company.getItem());
                entry.removeHistPrice();
                break;
            }
        }
    }

    /**
     * This methods displays all entries on the price board.
     * @return Returns an arraylist of entries on the price board.
     */
    public ArrayList<BoardEntry> getAllBoardEntries(){
        return this.allBoardEntries;
    }
}