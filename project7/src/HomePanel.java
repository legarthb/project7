import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.Icon;

/**
 * Represents the GUI component for painting an image of a playing card.
 * @author lambertk
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class HomePanel extends AbstractPanel{
	public AbstractCell cards;
    /**
     * Constructor for an empty panel, displays a wire frame. 
     */
    public HomePanel(){
    		setBackground(Color.cyan);
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
	    		int y = (getHeight() - image.getIconHeight()) / 2;
	    		g.drawRect(x, y, image.getIconWidth(), image.getIconHeight());
	    	}
	    	else{
	    			Card c = cards.peek();
	    			c.turn();
	    			image = c.getImage();
	    			int x = (getWidth() - image.getIconWidth()) / 2;
	    			int y = (getHeight() - image.getIconHeight()) / 2;
	    			image.paintIcon(this, g, x, y);
	    	}
	}
}
