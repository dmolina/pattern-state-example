package nostate;

public class PartidoTerminado extends Partido {
    public PartidoTerminado(Partido partido) {
		super(partido);
	}
    
	@Override
	public String toString() {
		return String.format("%s - %s : %d - %d", 
				local, visitante, puntosLocal, puntosVisitante);
	}
}
