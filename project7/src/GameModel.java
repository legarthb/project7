/**
 * Model of the entire FreeCell Game (FreeCellGame)
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class GameModel {
	private AbstractCell[] freeCells;
	private AbstractCell[] tableaux;
	private AbstractCell[] homeCells;
	private Deck deck;
	
	/**
	 * Constructs the Game Model Class
	 */
	public GameModel() {
		deck = new Deck();
		deck.shuffle();
		freeCells = new FreeCell[4];
		homeCells = new HomeCell[4];
		tableaux = new Tableau[8];
		for (int i = 0; i < 4; i++) {
			freeCells[i] = new FreeCell();
			homeCells[i] = new HomeCell();
		}
		
		for (int j = 0; j < 8; j++) {
			tableaux[j] = new Tableau();
		}
		for (int k = 0; k < 6; k++) {
			for (int l = 0; l<8; l++) {
				tableaux[l].add(deck.deal());
			}	
		}
		for (int m = 0; m < 4; m++) {
			tableaux[m].add(deck.deal());
		}
	}
	
	/**
	 * Checks to see if the object can move a card form one cell to the other
	 * @param cell1 cell being removed from
	 * @param cell2 cell getting a card
	 * @param card card that will be removed
	 */
	public void move(AbstractCell cell1, AbstractCell cell2) {
		if (! cell1.isEmpty()) {
			Card card = cell1.peek();
			if(cell2.canAddCard(card)) {
				cell2.add(card);
				cell1.remove();
			}
		}	
	}
	
	/**
	 * Converts the model to a string
	 * @return string representation
	 */
	public String toString() {
		String result = "Freecells: 								Homecells:";
		for (int i = 0; i < 4; i++) {
			result += freeCells[i].toString() + "								" + homeCells[i].toString() + "\n";
		}
		result += "Tableau Board:";
		for (int i = 0; i < 8; i++) {
			result += tableaux[i].toString() + "\n";
		}
		return result;
	}	
	
	/** Returns the ith free cell
	 * @return the ith cree Cell
	 */
	public AbstractCell[] getFreeCells() {
		return freeCells;
	}
	
	/** Returns the ith tableu
	 * @return the ith tableu
	 */
	public AbstractCell[] getTableauCells() {
		return tableaux;
	}
	
	/** Returns the ith home cell
	 * @return the ith home cell
	 */
	public AbstractCell[] getHomeCells() {
		return homeCells;
	}
}
