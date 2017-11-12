import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel extends JPanel {
	private AbstractCell cards;
    /**
     * Constructor for an empty panel, displays a wire frame. 
     */
    public AbstractPanel(){
    		setBackground(Color.BLUE);
    }
    public void paintComponent(Graphics g){
    		super.paintComponent(g);
    }
    /**
     * Paints the card's face image if a card is present, otherwise, paints the back side image.
     */
    public void setCells(AbstractCell cell) {
		cards = cell;
    }
    public AbstractCell getCells() {
    		return cards;
    }
    public boolean isEmpty() {
    		return cards.isEmpty();
    }
    public Card topCard() {
    		return cards.peek();
    }
}
