package nostate;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

public class PartidoJugando extends Partido {

	public PartidoJugando(Partido partido) {
		super(partido);
		this.hora_inicio = new LocalTime();
	}
	
	@Override
	public void addPuntosLocal(int puntos) {
		puntosLocal += puntos;
	}
	
	@Override
	public void addPuntosVisitante(int puntos) {
		puntosVisitante += puntos;
	}
	
	@Override
	public String toString() {
		LocalTime actual = new LocalTime();
		Period time = new Period(hora_inicio, actual);
		return String.format("%s - %s : %d - %d, %d minutes", 
				local, visitante, puntosLocal, puntosVisitante, 
				time.getHours());
	}

}
