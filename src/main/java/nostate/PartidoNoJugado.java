package nostate;


import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import common.Equipo;

public class PartidoNoJugado extends Partido {
	
	public PartidoNoJugado(Equipo local, Equipo visitante, LocalDate fecha) {
		super();
		this.local = local;
		this.visitante = visitante;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return String.format("%s - %s : %s", 
				local, visitante, fecha);
	}
}
