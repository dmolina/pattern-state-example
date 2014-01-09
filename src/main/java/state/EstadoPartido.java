package state;

public abstract class EstadoPartido {
	protected Partido partido;
	
	public EstadoPartido(Partido partido) {
		this.partido = partido;
	}
	public void addPuntosLocal(int puntos) {
		throw new IllegalStateException();
	}
	public void addPuntosVisitante(int puntos) {
		throw new IllegalStateException();
	}
    public abstract String toString();
}
