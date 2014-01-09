package state;

public class Terminado extends EstadoPartido {

	public Terminado(Partido partido) {
		super(partido);
	}

	@Override
	public String toString() {
		return String.format("%s - %s : %d - %d", 
				partido.local, partido.visitante, 
				partido.puntosLocal, partido.puntosVisitante);
	}

}
