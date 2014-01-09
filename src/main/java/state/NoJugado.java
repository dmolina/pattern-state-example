package state;

import org.joda.time.LocalTime;

public class NoJugado extends EstadoPartido {
	
	public NoJugado(Partido partido) {
		super(partido);
	}

	@Override
	public String toString() {
		return String.format("%s - %s : %s", 
				partido.local, partido.visitante, partido.fecha);
	}

}
