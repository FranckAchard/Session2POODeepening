package co.simplon.pf1;

public class Stone {

	private boolean firstPlayer;
	
	public Stone(boolean firstPlayer) {
		this.firstPlayer= firstPlayer;
	}
	
	public Stone(Stone pStone) {
		this.firstPlayer= pStone.firstPlayer;
	}
	
	public boolean isFirstPlayer() {
		return firstPlayer;
	}
	
	public void setFirstPlayer(boolean firstPlayer) {
		this.firstPlayer= firstPlayer;
	}
	
	public String toString() {
		return firstPlayer ? "O ":"X ";
	}
}
