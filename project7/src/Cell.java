import java.util.Iterator;

/**
 * Interface that makes all the different cells available
 * @author Brian
 * @author Chris Randall
 * @author Mark Donohue
 * @author Tommy Thetford
 */
<<<<<<< HEAD
public interface Cell<Card> extends Iterable<Card> {
	/**
	 * removes the top card
	 */
	public void remove();
	
	/**
	 * Checks to see if the stack is empty
	 * @return state of emptiness
=======
public interface Cell extends Iterable<Card>{
	
	/**
	 * Checks to see if a card can be added to the cell
	 * @param card being added
	 * @return if it was added
	 */
	public boolean addCard(Card c);
	
	/**
	 * Removes the top card from the cell
	 * @return the card which is removed
	 */
	public Card remove();
	
	/**
	 * Checks to see if the cell is empty
	 * @return if the card stack is empty
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
	 */
	public boolean isEmpty();
	
	/**
<<<<<<< HEAD
	 * gets the top card
	 * @return the top card
=======
	 * Determines if the card can be added from a cell
	 * @param cell where card is coming from
	 * @return if the card can be added
	 */
	public boolean canAddFromCell(Cell cell);
	
	/**
	 * Adds the card from a specified cell
	 * @param cell where card is coming from
	 */
	public void AddFromCell(Cell cell);
	
	/**
	 * Returns the card in the top of the cell
	 * @return top card of cell
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
	 */
	public Card peek();
	
    /**
     * Gets the size of the cell
     * @return size of the cell
     */
	public int size();
	
	/**
	 * Returns the card at a specified position in a cell
	 * @param i - position of card
	 * @return Card in said position
	 */
	public Card get(int i);
	
	/**
	 * I really dont see the point of this method //@BRIAN
	 * @param i
	 * @return
	 */
	public Card remove(int i);
	
	/**
	 * Checks to see if the cards are in proper order in the cell
	 * @return if cards are in order
	 */
	public boolean inOrder();
	
	/**
	 * Returns an iterator on the cell object between cards
	 * @return an iterator through cards in cell
	 */
	public Iterator<Card> iterator();
	
	/**
	 * Returns a string representation of the cell
	 * @return string representation
	 */
	public String toString();
	
	
	
}