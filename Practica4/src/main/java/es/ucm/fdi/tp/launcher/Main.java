package es.ucm.fdi.tp.launcher;

import es.ucm.fdi.tp.base.console.ConsolePlayer;
import es.ucm.fdi.tp.base.model.GameAction;
import es.ucm.fdi.tp.base.model.GamePlayer;
import es.ucm.fdi.tp.base.model.GameState;
import es.ucm.fdi.tp.base.player.RandomPlayer;
import es.ucm.fdi.tp.base.player.SmartPlayer;
import es.ucm.fdi.tp.ttt.TttState;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Demo main, used to test game functionality. You can use it as an inspiration,
 * but we expect you to build your own main-class.
 */
public class Main {

	public static <S extends GameState<S, A>, A extends GameAction<S, A>> int playGame(GameState<S, A> initialState,
			List<GamePlayer> players) {
		int playerCount = 0;
		for (GamePlayer p : players) {
			p.join(playerCount++); // welcome each player, and assign
									// playerNumber
		}
		@SuppressWarnings("unchecked")
		S currentState = (S) initialState;

		while (!currentState.isFinished()) {
			// request move
			A action = players.get(currentState.getTurn()).requestAction(currentState);
			// apply move
			currentState = action.applyTo(currentState);
			System.out.println("After action:\n" + currentState);

			if (currentState.isFinished()) {
				// game over
				String endText = "The game ended: ";
				int winner = currentState.getWinner();
				if (winner == -1) {
					endText += "draw!";
				} else {
					endText += "player " + (winner + 1) + " (" + players.get(winner).getName() + ") won!";
				}
				System.out.println(endText);
			}
		}
		return currentState.getWinner();
	}

	/*
	public static void match(GameState<?, ?> initialState, GamePlayer a, GamePlayer b, int times) {
		int va = 0, vb = 0;

		List<GamePlayer> players = new ArrayList<GamePlayer>();
		players.add(a);
		players.add(b);

		for (int i = 0; i < times; i++) {
			switch (playGame(initialState, players)) {
			case 0:
				va++;
				break;
			case 1:
				vb++;
				break;
			}
		}
		System.out.println("Result: " + va + " for " + a.getName() + " vs " + vb + " for " + b.getName());
	}
	*/

	
	public static void testTtt() {
		try (Scanner s = new Scanner(System.in)) {
			List<GamePlayer> players = new ArrayList<GamePlayer>();
			GameState<?, ?> game = new TttState(3);
			players.add(new ConsolePlayer("Lobo", s));
			players.add(new ConsolePlayer("Obeja", s));
			playGame(game, players);
		}
	}
	

/******************************************************************/
	
	
	public static GameState<?, ?> /*<S extends GameState<S, A>, A extends GameAction<S, A>>*/ createInitialState(String gameName){
		return null;
	}
	
	/*
	 * gameName podrá ser cualquiera de las abreviaturas de juegos anteriorment
	 * playerType podrá ser cualquiera de los tipos de jugador anteriormente descritos.
	 */
	
	public static GamePlayer createPlayer(String gameName,String playerType, String playerName){
		return null;
		
	}
	public void createInitialState(){
		
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		 testTtt();
		//match(new TttState(3), new SmartPlayer("AiAlice", 5), new RandomPlayer("AiBob"), 100);
	}
}
