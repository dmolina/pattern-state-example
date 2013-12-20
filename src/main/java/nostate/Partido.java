package nostate;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import common.Equipo;

public abstract class Partido {
	protected Equipo local;
	protected Equipo visitante;
	protected LocalDate fecha;
	protected int puntosLocal;
	protected int puntosVisitante;
	protected LocalTime hora_inicio;
	
	public Partido() {		
	}
	public Partido(Partido partido) {
		this.local = partido.local;
		this.visitante = partido.visitante;
		this.fecha = partido.fecha;
		this.hora_inicio = partido.hora_inicio;
		this.puntosLocal = partido.puntosLocal;
		this.puntosVisitante = partido.puntosVisitante;
	}
	
	public void addPuntosLocal(int puntos) {
		throw new IllegalStateException();
	}
	public void addPuntosVisitante(int puntos) {
		throw new IllegalStateException();
	}
	public abstract String toString();
}
