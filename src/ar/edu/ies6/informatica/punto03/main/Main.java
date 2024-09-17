package ar.edu.ies6.informatica.punto03.main;

import ar.edu.ies6.informatica.punto03.model.Provincia;
import ar.edu.ies6.informatica.punto03.util.AlmacenProvincias;
import ar.edu.ies6.informatica.punto03.util.Region;

public class Main {
	 public static void main(String[] args) {
	  // provincias true
      AlmacenProvincias.provincias[0] = new Provincia(1,"Jujuy", Region.NOA, 2343000, 88000.0, true);
      AlmacenProvincias.provincias[1] = new Provincia(2,"Salta", Region.NEA, 2345000, 78000.0, true);
      AlmacenProvincias.provincias[2] = new Provincia(3,"Catamarca", Region.CENTRO, 7689000, 23400.0, true);
      AlmacenProvincias.provincias[3] = new Provincia(4,"Santa Cruz", Region.CUYO, 7908790, 2324300.0, true);
      AlmacenProvincias.provincias[4] = new Provincia(5,"La Rioja", Region.PATAGONIA, 213100, 6575600.0, true);

	   // provincias false
      AlmacenProvincias.provincias[5] = new Provincia(6,"Tucuman", Region.NOA, 2567560, 879780.0, false);
      AlmacenProvincias.provincias[6] = new Provincia(7,"Chubut", Region.NEA, 8888000, 18790.0, false);
      AlmacenProvincias.provincias[7] = new Provincia(8,"La Pampa", Region.CENTRO, 9099000, 29789700.0, false);
      AlmacenProvincias.provincias[8] = new Provincia(9,"Neuquen", Region.CUYO, 789700, 908900.0, false);
      AlmacenProvincias.provincias[9] = new Provincia(10,"San Juan", Region.PATAGONIA, 789700, 8797890.0, false);

	   // mostramos los true
	for (Provincia provincia : AlmacenProvincias.provincias) {
	     if (provincia.isEstado()) {
	          System.out.println(provincia);
	         }
	    }
	}
}

