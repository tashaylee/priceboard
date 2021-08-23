package priceboard;

/**
 * This interface is the blueprint for an Originator.
 */
public interface Originator{
    /**
     * This method saves an Originator object's current price.
     * @return HistoricalPrice object representing an entity's last price.
     */
    public HistoricalPrice saveCurrentPrice();
}