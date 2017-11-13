import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class CardPanel extends JPanel {
	private AbstractCell cards;
   
	/**
     * Constructor for an empty panel, displays a wire frame. 
     */
    public CardPanel(){
    		setBackground(Color.GREEN);
    }

    /**
     * Paints the card's face image if a card is present, otherwise, paints the back side image.
     */
    public void paintComponent(Graphics g){
	    	super.paintComponent(g);
	    	Icon image;
	    	if (cards.isEmpty()){
	    		image = Card.getBack();
	    		g.setColor(Color.yellow);
	    		int x = (getWidth() - image.getIconWidth()) / 2;
	    		g.drawRect(x, 0, image.getIconWidth(), image.getIconHeight());
	    	}
	    	else{
	    		int count = 0;
	    		for (Card c : cards) {
	    			c.turn();
	    			image = c.getImage();
	    			int x = (getWidth() - image.getIconWidth()) / 2;
	    			int y = count * 30;
	    			image.paintIcon(this, g, x, y);
	    			count++;
	    		}
	    	}
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
}

