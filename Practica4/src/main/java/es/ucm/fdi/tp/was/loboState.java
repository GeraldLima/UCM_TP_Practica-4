package es.ucm.fdi.tp.was;

import java.util.ArrayList;
import java.util.List;

import es.ucm.fdi.tp.ttt.TttAction;
import es.ucm.fdi.tp.ttt.TttState;

public class loboState extends TttState{

	public loboState(TttState prev, int[][] board, boolean finished, int winner) {
		super(prev, board, finished, winner);
		// TODO Auto-generated constructor stub
	}
	public loboState(int dim) {
		super(dim);
		// TODO Auto-generated constructor stub
	}
	
	//@Override
	public List<TttAction> validActions(int playerNumber) {
		 ArrayList<TttAction> valid = new ArrayList<>();
		 return valid;
	}
	//@Override
	public static boolean isWinner(int[][] board, int playerNumber) {
		return false;
	}

}
