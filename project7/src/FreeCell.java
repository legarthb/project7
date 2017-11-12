/**
 * Free cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class FreeCell extends AbstractCell implements Cell<Card>{
	public FreeCell() {
		super();
	}
	/**
	 * checks to see if a card can be added to the free cell
	 * @param card being added
	 * @return if it was added
	 */
	public boolean canAddCard(Card card) {
		if (this.isEmpty()) {
			return true;
		}
		else
			System.out.println("Only one card in a free cell");
			return false;
	}
	
}