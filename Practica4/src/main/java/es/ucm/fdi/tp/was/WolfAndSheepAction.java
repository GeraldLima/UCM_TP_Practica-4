package es.ucm.fdi.tp.was;

import es.ucm.fdi.tp.base.model.GameAction;

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
	public WolfAndSheepState applyTo(WolfAndSheepState state) {
		
		return null;
	}

}
