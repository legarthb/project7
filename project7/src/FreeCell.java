/**
 * Free cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
<<<<<<< HEAD
public class FreeCell extends AbstractCell implements Cell<Card>{
	public FreeCell() {
		super();
	}
=======
public class FreeCell extends AbstractCell implements Cell {
 

	private Iterator<Card> iter;
	
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;
 
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
	/**
	 * checks to see if a card can be added to the free cell
	 * @param card being added
	 * @return a boolean value
	 */
	public boolean canAddCard(Card card) {
		if (this.isEmpty()) {
			return true;
		}
		else
			System.out.println("Only one card in a free cell");
			return false;
	}
	
<<<<<<< HEAD
=======

	//These three methods need to be completed
	public Iterator<Card> iterator(){
		this.iter = cardStack.Iterator();
		return iter;
	}
	public boolean canAddFromCell(Cell cell);
	public boolean inOrder();
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
}