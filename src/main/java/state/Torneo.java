package state;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<Partido> partidos;
	
	public Torneo() {
		partidos = new ArrayList<Partido>();
	}
	
	public void addPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public Partido getPartido(int pos) {
		return partidos.get(pos);
	}
	
	public void iniciaPartido(int pos) {
		Partido partido = partidos.get(pos);
		partido.inicia();	}

	public void finPartido(int pos) {
		Partido partido = partidos.get(pos);
		partido.finaliza();
	}
	
}
