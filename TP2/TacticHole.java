// # `TacticHole` (represents a proof in progress) 
package TP2;

public class TacticHole extends Tactic {
	// Each hole is identified by a fresh integer. 
	static int n = 0;
	int i;
	public TacticHole() {
		this.i= TacticHole.n++;
	}
	public String toString() {
		return "TacticHole" + i;
	}
	// A proof with a hole is incomplete. 
	// It prints the current sequent yet to be proved. 
	public boolean prove(Sequent s) {
		System.out.println("where " + this + " : " + s);
		return false;
	}
}

