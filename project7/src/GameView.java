import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main window class for GameModel (AppView).
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class GameView extends JFrame{

    private GameModel game;
    private JPanel cont1;
    private JPanel cont2;
    private JPanel cont3;
    private AbstractPanel[] freePanels;
    private AbstractPanel[] homePanels;
    private AbstractPanel[] tableauPanels;
    private AbstractCell[] freeCells;
    private AbstractCell[] homeCells;
    private AbstractCell[] tableauCells;

    public GameView(){
    		
    		cont1 = new JPanel();
        cont1.setSize(800, 200);
        cont1.setLayout(new GridLayout(0,8));
        cont2 = new JPanel();
        cont2.setSize(800, 400);
        cont2.setLayout(new GridLayout(0,8));
		cont3 = new JPanel();
		cont3.setSize(800, 50);
		
		game = new GameModel();
        
		freePanels = new FreePanel[4];
	    homePanels = new HomePanel[4];
	    tableauPanels = new TableauPanel[8];
	    
	    freeCells = game.getFreeCells();
	    homeCells = game.getHomeCells();
	    tableauCells = game.getTableauCells();
	   
	    for (int i = 0; i < 4; i++){
	    		freePanels[i] = new FreePanel();
	    		freePanels[i].setSize(100, 200);
	    		freePanels[i].setCells(freeCells[i]);
	    		cont1.add(freePanels[i]);
	    		
	    		homePanels[i] = new HomePanel();
	    		homePanels[i].setSize(100,200);
	    		homePanels[i].setCells(homeCells[i]);
	    }
	    for (int j = 0; j < 4; j++){
	    		cont1.add(homePanels[j]);
	    }
	    for (int k = 0; k < 8; k++) {
			tableauPanels[k] = new TableauPanel();
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
        
        GridBagLayout grid = new GridBagLayout();
        c.setLayout(grid);
        GridBagConstraints con = new GridBagConstraints();
        
        con.fill = GridBagConstraints.HORIZONTAL;
        con.ipady = 150;
        con.gridx = 0;
        con.gridy = 0;
        con.gridwidth = 3;
        con.weightx = 0.5;
        grid.setConstraints(cont1, con);
        c.add(cont1);
        
        con.fill = GridBagConstraints.HORIZONTAL;
        con.ipady = 400;
        con.gridx = 0;
        con.gridy = 1;
        con.gridwidth = 3;
        con.weightx = 0.0;
        grid.setConstraints(cont2, con);
        c.add(cont2);
        
        con.fill = GridBagConstraints.HORIZONTAL;
        con.ipady = 100;      
        con.weighty = 1.0;   
        con.anchor = GridBagConstraints.PAGE_END; 
        con.insets = new Insets(10,0,0,0); 
        con.gridx = 1;     
        con.gridwidth = 2;  
        con.gridy = 2;  
        grid.setConstraints(cont3, con);
        c.add(cont3);

    }
    
    /**
     * Resets the main view.
     */
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
        