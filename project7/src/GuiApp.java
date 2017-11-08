
import javax.swing.JFrame;

/**
 * Generic main method template for any GUI-based application.
 * Instantiates a model and passes it to a new view.
 * @author lambertk
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class GuiApp{

    public static void main(String[] args){
        final Deck deck = new Deck();
        final JFrame view = new mainview(deck);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("The Game of War");
        view.setSize(1000, 750);
        view.setResizable(false);
        view.setVisible(true);
    }
}

