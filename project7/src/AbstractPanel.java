import javax.swing.*;
import java.awt.*;

/**
 * Abstract implementation of Panel
 * @author Brian Legarth
 * @author Chris Randall
 * @author Mark Donohue
 * @author Tommy Thetford
 */

public abstract class AbstractPanel extends JPanel {
	private AbstractCell cards;
	
    /**
     * Constructor for an empty panel, displays a wire frame. 
     */
    public AbstractPanel(){
    		setBackground(Color.BLUE);
    }
    
    /**
     * Paints the card's face image if a card is present; 
     * otherwise, paints the back side image.
     */    
    public void paintComponent(Graphics g){
    		super.paintComponent(g);
    }
    
    /**
     * Assigns cards to a cell
     */
    public void setCells(AbstractCell cell) {
		cards = cell;
    }
    
    /**
     * Returns cards collection
     * @return cards collection
     */
    public AbstractCell getCells() {
    		return cards;
    }
    
    /**
     * Checks if cards is empty
     * @return if cards is empty
     */
    public boolean isEmpty() {
    		return cards.isEmpty();
    }
    
    /**
     * Returns the top card
     * @return the top card 
     */
    public Card topCard() {
    		return cards.peek();
    }
}
