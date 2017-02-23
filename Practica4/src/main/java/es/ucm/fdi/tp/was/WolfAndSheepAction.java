package es.ucm.fdi.tp.was;

import es.ucm.fdi.tp.base.model.GameAction;
import es.ucm.fdi.tp.base.model.GameState;

@SuppressWarnings("serial")
public class WolfAndSheepAction implements GameAction<WolfAndSheepState, WolfAndSheepAction> {

	private int player;
	private int fil;
	private int col;
	
	public WolfAndSheepAction(int jugador, int fila, int columna) {
		player = jugador;
		fil = fila;
		col = columna;
	}
	
	
	
	@Override
	public int getPlayerNumber() {
		return player;
	}

	@Override
	public GameState applyTo(GameState state) {
		
		return null;
	}
	
	public stateWol

}
