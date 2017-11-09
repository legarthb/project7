

import java.util.*;
/**
 * Free cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class FreeCell extends AbstractCell implements Cell {
 

	private Iterator<Card> iter;
	
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;
 
	/**
	 * checks to see if a card can be added to the free cell
	 * @param card being added
	 * @return a boolean value
	 */
	public boolean addCard(Card card) {
		if (this.isEmpty() == true) {
			cardStack.add(card);
			this.topCard = card;
			return true;
		}
		else
			System.out.println("Only one card in a free cell");
			return false;
	}
	

	//These three methods need to be completed
	public Iterator<Card> iterator(){
		this.iter = cardStack.Iterator();
		return iter;
	}
	public boolean canAddFromCell(Cell cell);
	public boolean inOrder();
}