package nostate;

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
		
		if (!(partido instanceof PartidoNoJugado)) {
			throw new IllegalStateException();
		}
		else {
			PartidoJugando nuevoPartido;
			nuevoPartido = new PartidoJugando(partido);
			partidos.set(pos, nuevoPartido);			
		}
		
	}

	public void finPartido(int pos) {
		Partido partido = partidos.get(pos);
		
		if (!(partido instanceof PartidoJugando)) {
			throw new IllegalStateException();
		}
		else {
			PartidoTerminado nuevoPartido;
			nuevoPartido = new PartidoTerminado(partido);
			partidos.set(pos, nuevoPartido);
		}
		
	}
	
}
