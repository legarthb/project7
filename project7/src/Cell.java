/**
 * Interface that makes all the different cells available
 * @author Brian
 * @author Chris Randall
 * @author Mark Donohue
 * @author Tommy Thetford
 */
public interface Cell<Card> extends Iterable<Card> {
	/**
	 * removes the top card
	 */
	public void remove();
	
	/**
	 * Checks to see if the stack is empty
	 * @return state of emptiness
	 */
	public boolean isEmpty();
	
	/**
	 * gets the top card
	 * @return the top card
	 */
	public Card peek();
}