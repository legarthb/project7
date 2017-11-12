import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class GameView extends JFrame{

    private GameModel game;
    private JPanel cont1;
    private JPanel cont2;
    private JPanel cont3;
    private CardPanel[] freePanels;
    private CardPanel[] homePanels;
    private CardPanel[] tableauPanels;
    private AbstractCell[] freeCells;
    private AbstractCell[] homeCells;
    private AbstractCell[] tableauCells;

    public GameView(){
    		
    		cont1 = new JPanel();
        cont1.setSize(800, 200);
        cont1.setLayout(new GridLayout(1,8));
        cont2 = new JPanel();
        cont2.setSize(800, 400);
        cont2.setLayout(new GridLayout(1,8));
		cont3 = new JPanel();
		cont3.setSize(800, 50);
		
		game = new GameModel();
        
		freePanels = new CardPanel[4];
	    homePanels = new CardPanel[4];
	    tableauPanels = new CardPanel[8];
	    
	    freeCells = game.getFreeCells();
	    homeCells = game.getHomeCells();
	    tableauCells = game.getTableauCells();
	   
	    for (int i = 0; i < 4; i++){
	    		freePanels[i] = new CardPanel();
	    		freePanels[i].setSize(100, 200);
	    		freePanels[i].setCells(freeCells[i]);
	    		cont1.add(freePanels[i]);
	    		
	    		homePanels[i] = new CardPanel();
	    		homePanels[i].setSize(100,200);
	    		homePanels[i].setCells(homeCells[i]);
	    }
	    for (int j = 0; j < 4; j++){
	    		cont1.add(homePanels[j]);
	    }
	    for (int k = 0; k < 8; k++) {
			tableauPanels[k] = new CardPanel();
			tableauPanels[k].setSize(100,400);
			tableauPanels[k].setCells(tableauCells[k]);
			cont2.add(tableauPanels[k]);
	    }
		
        JButton newGame = new JButton("New Game");
        newGame.setSize(200,50);
        newGame.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			reset();
        		}
        });
        cont3.add(newGame);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(cont1, BorderLayout.NORTH);
        c.add(cont2, BorderLayout.CENTER);
        c.add(cont3, BorderLayout.SOUTH);  
    }
    
    public void reset() {
    		game = new GameModel();
    		freeCells = game.getFreeCells();
    	    homeCells = game.getHomeCells();
    	    tableauCells = game.getTableauCells();
    	    for (int i = 0; i < 4; i++){
	    		freePanels[i].setCells(freeCells[i]);
	    		homePanels[i].setCells(homeCells[i]);
	    }
    	    for (int j = 0; j < 8; j++) {
	    		tableauPanels[j].setCells(tableauCells[j]);
	    }
    	    repaint();
    }
}
        