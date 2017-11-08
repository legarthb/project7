/**
 * Tester of the entire FreeCell Game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class GameTest{
    public static void main(String[] args) {
		GameModel game = new GameModel();
		
		//Initial layout of game with all cards dealt
		System.out.println(game.toString());
		
		//Creating general piles so that testing movement can be easy
		Tableau t1 = new Tableau();
		Tableau t2 = new Tableau();
		Tableau t3 = new Tableau();
		Tableau t4 = new Tableau();
		FreeCell f1 = new FreeCell();
		HomeCell spadeHome = new HomeCell();
		
		//Creating cards to test the movement between piles
		Card aceSpade = new Card( new Suit(4,"spades"), 1);
		Card twoSpade = new Card(new Suit(4,"spades"), 2);
		Card twoDiamonds = new Card(new Suit(2, "diamonds"), 2);
		Card kingHearts = new Card(new Suit(3, "hearts"), 13);
		
		//Add cards to beginning tableau piles
		t1.addCardStart(aceSpade);
		t2.addCardStart(twoSpade);
		t3.addCardStart(twoDiamonds);
		t4.addCardStart(kingHearts);
		
		//Incorrect move onto a tableau (moving ace of spades onto two of spades)
		System.out.println("Expect a tableau incorrect move output");
		game.move(t1, t2);
		
		//Correct move onto a tableau (moving ace of spades onto two of diamonds)
		System.out.println("Expect: 2 of diamonds ace of spades");
		game.move(t1, t3);
		System.out.println(t3.toString());
		
		//Incorrect move to home cell (moving two of spades onto empty home cell)
		System.out.println("Expect home cell incorrect move output");
		game.move(t2,  spadeHome);
		
		//Correct move to home cell (moving ace of spades onto a home cell)
		System.out.println("Expect Ace of spades");
		game.move(t3, spadeHome);
		System.out.println(spadeHome.toString());
		
		//Second correct move to home cell (two of spades onto ace of spades)
		System.out.println("Expect Ace of spades two of spades");
		game.move(t2,  spadeHome);
		System.out.println(spadeHome.toString());
		
		//Correct move onto free cell (king of hearts onto empty free cell)
		System.out.println("Expect King of hearts");
		game.move(t4, f1);
		System.out.println(f1.toString());
		
		//Incorrect move into a free cell (two of diamonds on top of king of hearts)
		System.out.println("Expect free cell incorrect move output");
		game.move(t3, f1);
		
		//Correct move into tableau cell (moving king back to a empty tableau cell)
		System.out.println("Expect King of hearts");
		game.move(f1,  t4);
		System.out.println(t4.toString());
		
	}
	
}
