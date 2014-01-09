package state;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import common.Equipo;

public class Partido {
	protected Equipo local;
	protected Equipo visitante;
	protected LocalDate fecha;
	protected int puntosLocal;
	protected int puntosVisitante;
	private EstadoPartido estado;

	public Partido(Equipo local, Equipo visitante, LocalDate fecha) {
		this.local = local;
		this.visitante = visitante;
		this.fecha = fecha;
		puntosLocal = 0;
		puntosVisitante = 0;
		estado = new NoJugado(this); 
	}

	public void addPuntosLocal(int puntos) {
		estado.addPuntosLocal(puntos);
	}
	public void addPuntosVisitante(int puntos) {
		estado.addPuntosVisitante(puntos);
	}
	
	public  void inicia() {
		if (estado instanceof NoJugado) {
			estado = new Jugando(this);
		}
		else {
			throw new IllegalStateException();
		}
	}
	
	public void finaliza() {
		if (estado instanceof Jugando) {
			estado = new Terminado(this);
		}
		else {
			throw new IllegalStateException();
		}
	}
	
	@Override
	public String toString() {
		return estado.toString();
	}
}
