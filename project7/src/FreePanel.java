import java.awt.*;
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

public class FreePanel extends AbstractPanel{
    private AbstractCell cards;
	/**
     * Constructor for an empty panel, displays a wire frame. 
     */
    public FreePanel(){
    		setBackground(Color.blue);
        
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
	    		g.drawRect(0, 0, image.getIconWidth(), image.getIconHeight());
	    	}
	    	else{
	    			Card c = cards.peek();
	    			c.turn();
	    			image = c.getImage();
	    			image.paintIcon(this, g, 0, 0);
	    	}
    }
}

