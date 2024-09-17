package ar.edu.ies6.informatica.punto02.main;

import ar.edu.ies6.informatica.punto02.model.Efemeride;
import ar.edu.ies6.informatica.punto02.util.AlmacenEfemerides;
import ar.edu.ies6.informatica.punto02.util.Mes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AlmacenEfemerides.almacenEfemerides.add(new Efemeride(1, "Independencia", Mes.JULIO, 9, "Celebración del día de la independencia"));
AlmacenEfemerides.almacenEfemerides.add(new Efemeride(2, "Dia del Veterano", Mes.ABRIL, 2, "Celebración del día del veterano"));
AlmacenEfemerides.almacenEfemerides.add(new Efemeride(3, "Dia del Inmigrante", Mes.SEPTIEMBRE, 2, "Dia del Inmigrante ilegal"));
AlmacenEfemerides.almacenEfemerides.add(new Efemeride(4, "Dia de la no Violencia", Mes.OCTUBRE, 2, "Dia de la no Violencia"));
AlmacenEfemerides.almacenEfemerides.add(new Efemeride(5, "Dia de la Tradicion", Mes.NOVIEMBRE, 10, "Celebración por el Dia de la Tradicion"));

int celebracion = AlmacenEfemerides.almacenEfemerides.size();
System.out.println("el listado de efemerides son: " +celebracion);

for(int i=0; i<celebracion; i++)
	System.out.println(AlmacenEfemerides.almacenEfemerides.get(i).toString());


//Eliminar la tercera efeméride
		AlmacenEfemerides.almacenEfemerides.remove(2);

		// Modificar la segunda efeméride (nombre y detalle)
		Efemeride segundaEfemeride = AlmacenEfemerides.almacenEfemerides.get(1);
		segundaEfemeride.setNombre("Malvinas");
		segundaEfemeride.setDetalle("Conmemoración de la Guerra de Malvinas");

		// Mostrar las 4 efemérides restantes
		System.out.println("Las 4 efemérides restantes son:");
		for (Efemeride efemeride : AlmacenEfemerides.almacenEfemerides) {
			System.out.println(efemeride.getNombre() + " - " + efemeride.getDia() + " de " + efemeride.getMes());
		}
	}
}

