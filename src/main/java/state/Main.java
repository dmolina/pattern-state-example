package state;

import org.joda.time.LocalDate;

import common.Equipo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Torneo torneo = new Torneo();
		Equipo spain = new Equipo("España");
		Equipo france = new Equipo("Francia");
		LocalDate fecha = new LocalDate().plusDays(1);
		
		torneo.addPartido( new Partido(spain, france, fecha));
		torneo.addPartido( new Partido(france, spain, fecha.plusDays(7)));
		
		System.out.println(torneo.getPartido(0));
		System.out.println(torneo.getPartido(1));
		
		torneo.iniciaPartido(0);
		Partido partido = torneo.getPartido(0);
		partido.addPuntosLocal(3);
		partido.addPuntosVisitante(1);
		
		System.out.println(torneo.getPartido(0));
		System.out.println(torneo.getPartido(1));
		
		torneo.finPartido(0);
		
		//partido.addPuntosLocal(4);
		System.out.println(torneo.getPartido(0));
		System.out.println(torneo.getPartido(1));
		
	}

}
