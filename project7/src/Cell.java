/**
 * Interface that makes all the different cells available
 * @author Brian
 * @author Chris Randall
 * @author Mark Donohue
 * @author Tommy Thetford
 */
public interface Cell {
	public boolean addCard(Card c);
	public void remove();
	public boolean isEmpty();
	public Card peek();
}