package state;

import org.joda.time.LocalTime;
import org.joda.time.Period;

public class Jugando extends EstadoPartido {
	LocalTime hora_inicio;

	public Jugando(Partido partido) {
		super(partido);
		this.hora_inicio = new LocalTime();		
	}
	
	@Override
	public void addPuntosLocal(int puntos) {
		partido.puntosLocal += puntos;
	}
	
	@Override
	public void addPuntosVisitante(int puntos) {
		partido.puntosVisitante += puntos;
	}
	
	@Override
	public String toString() {
		LocalTime actual = new LocalTime();
		Period time = new Period(hora_inicio, actual);
		return String.format("%s - %s : %d - %d, %d minutes", 
				partido.local, partido.visitante, partido.puntosLocal, partido.puntosVisitante, 
				time.getHours());
	}
}
