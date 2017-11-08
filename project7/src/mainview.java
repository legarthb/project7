import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The main window for dealing from a deck of cards.
 * @author lambertk
 *
 */
public class mainview extends JFrame{
//Gui's are tough
    private Deck deck;

    public mainview(Deck deck){
        this.deck = deck;
        JPanel cont1 = new JPanel();
        cont1.setSize(200, 375);
        cont1.setLayout(new GridLayout(1,4));
        
        JPanel cont2 = new JPanel();
        cont2.setSize(200, 375);
        cont2.setLayout(new GridLayout(1,4));
        
        CardPanel freecell1 = new CardPanel();
        freecell1.setSize(200,80);
        CardPanel freecell2 = new CardPanel();
        freecell2.setSize(200,80);
        CardPanel freecell3 = new CardPanel();
        freecell3.setSize(200,80);
        CardPanel freecell4 = new CardPanel();
        freecell4.setSize(200,80);
        cont1.add(freecell1);
        cont1.add(freecell2);
        cont1.add(freecell3);
        cont1.add(freecell4);
        
        CardPanel homecell1 = new CardPanel();
        homecell1.setSize(200,80);
        CardPanel homecell2 = new CardPanel();
        homecell2.setSize(200,80);
        CardPanel homecell3 = new CardPanel();
        homecell3.setSize(200,80);
        CardPanel homecell4 = new CardPanel();
        homecell4.setSize(200,80);
        cont2.add(homecell1);
        cont2.add(homecell2);
        cont2.add(homecell3);
        cont2.add(homecell4);
        
        TableauPanel tableau1 = new TableauPanel();
        TableauPanel tableau2 = new TableauPanel();
        TableauPanel tableau3 = new TableauPanel();
        TableauPanel tableau4 = new TableauPanel();
        TableauPanel tableau5 = new TableauPanel();
        TableauPanel tableau6 = new TableauPanel();
        TableauPanel tableau7 = new TableauPanel();
        TableauPanel tableau8 = new TableauPanel();
        JButton button = new JButton("New Game");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (! deck.isEmpty()){
                    Card card = deck.deal();
                    card.turn();
                    freecell1.setCard(card);
                }
            }});
        Container c = getContentPane();
        c.add(freecell1, BorderLayout.WEST);
        c.add(button, BorderLayout.SOUTH);
    }
}
