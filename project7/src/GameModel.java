
/**
 * Model of the entire FreeCell Game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class GameModel {
	private FreeCell[] freeCells;
	private Tableau[] tableaux;
	private HomeCell[] homeCells;
	private Deck deck;
	
	/**
	 * Constructs the Game Model Class
	 */
	public GameModel() {
		deck = new Deck();
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
				tableaux[l].addCardStart(deck.deal());
			}	
		}
		for (int m = 0; m < 4; m++) {
			tableaux[m].addCardStart(deck.deal());
		}
	}
	/**
	 * Checks to see if the object can move a card form one cell to the other
	 * @param cell1 cell being removed from
	 * @param cell2 cell getting a card
	 * @param card card that will be removed
	 */
	public void move(Object cell1, Object cell2) {
		if (cell1 instanceof FreeCell) {
			FreeCell newCell1 = (FreeCell)cell1;
			if (! newCell1.isEmpty()) {
				Card card = newCell1.peek();
				if (cell2 instanceof FreeCell) {
					FreeCell newCell2 = (FreeCell)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
					}
				else if (cell2 instanceof Tableau) {
					Tableau newCell2 = (Tableau)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
					}
				else {
					HomeCell newCell2 = (HomeCell)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
				}
			}
		}
		else if (cell1 instanceof Tableau) {
			Tableau newCell1 = (Tableau)cell1;
			if (! newCell1.isEmpty()) {
				Card card = newCell1.peek();
				if (cell2 instanceof FreeCell) {
					FreeCell newCell2 = (FreeCell)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
					}
				else if (cell2 instanceof Tableau) {
					Tableau newCell2 = (Tableau)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
					}
				else {
					HomeCell newCell2 = (HomeCell)cell2;
					if (newCell2.addCard(card)) {newCell1.remove();}
				}
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
}
