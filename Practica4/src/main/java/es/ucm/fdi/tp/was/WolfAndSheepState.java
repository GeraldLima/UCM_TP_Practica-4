package es.ucm.fdi.tp.was;

import java.util.List;

import es.ucm.fdi.tp.base.model.GameState;

@SuppressWarnings("serial")
public class WolfAndSheepState extends GameState<WolfAndSheepState, WolfAndSheepAction> {

	private final int turno;
	private final int ganador;
	private final boolean finished;
	//TODO hay que mirar si se puede extender directamente del juego ttt
	private final int [][] board;
	private final int dim;
	final static int EMPTY = -1;
	
	public WolfAndSheepState(int dimension) {
		super(dimension);
       /* if (dimension < 3 || dimension > 4) {
            throw new IllegalArgumentException("Expected dim to be 3 or 4");
        }*/

        this.dim = dimension;
        board = new int[dimension][];
        for (int i=0; i<dimension; i++) {
            board[i] = new int[dimension];
            for (int j=0; j<dimension; j++) board[i][j] = EMPTY;
        }
        turno = 0;
        ganador = -1;
        finished = false;
	}
    public WolfAndSheepState(WolfAndSheepState prev, int[][] board, boolean finished, int winner) {
    	super(2);
    	dim = prev.dim;//TODO Q es esto?¿?
    	this.board = board;
    	turno = siguienteTurno(prev.turno);//TODO Q es esto?¿?
    	this.finished = finished;
    	ganador = winner;
    }
	
    private int siguienteTurno(int turn){
    	return (turn + 1) % 2;
    }

	@Override
	public int getTurn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List validActions(int playerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWinner() {
		// TODO Auto-generated method stub
		return 0;
	}

}
