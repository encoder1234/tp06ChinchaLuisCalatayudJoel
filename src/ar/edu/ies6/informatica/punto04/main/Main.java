package ar.edu.ies6.informatica.punto04.main;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto01.model.Producto;
import ar.edu.ies6.informatica.punto01.util.Categoria;
import ar.edu.ies6.informatica.punto01.util.ListadoProducto;
import ar.edu.ies6.informatica.punto01.util.OrigenFabricacion;
import ar.edu.ies6.informatica.punto04.model.Compra;
import ar.edu.ies6.informatica.punto04.util.AlmacenCosas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListadoProducto.almacenDeProductos.add(new Producto("6", "Mesa", 43400.0, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR));
		 ListadoProducto.almacenDeProductos.add(new Producto("7", "Libro", 7876400.0, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR));
		 ListadoProducto.almacenDeProductos.add(new Producto("8", "gabinete", 33450.0, OrigenFabricacion.BRASIL, Categoria.INFORMATICA));
		 ListadoProducto.almacenDeProductos.add(new Producto("9", "lampara", 760.0, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR));
		 ListadoProducto.almacenDeProductos.add(new Producto("10", "teclado", 9890.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
		 
		 
		 ListadoProducto.almacenDeProductos.add(new Producto("11", "xiaomi note 12", 498900.0, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
		 ListadoProducto.almacenDeProductos.add(new Producto("12", "Mini PC Gamer", 556700.0, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA));
		 ListadoProducto.almacenDeProductos.add(new Producto("13", "Secador de pelo", 3200.0, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR));
		 ListadoProducto.almacenDeProductos.add(new Producto("14", "Martillo", 1230.0, OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS));
		 ListadoProducto.almacenDeProductos.add(new Producto("15", "Mouse Pad RGB", 769200.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
		 
		// Creando compras usando los productos
	        AlmacenCosas.compras[0] = new Compra("14", LocalDate.now(), ListadoProducto.almacenDeProductos.get(0), 5); // Compra de "Mesa"
	        AlmacenCosas.compras[1] = new Compra("15", LocalDate.now(), ListadoProducto.almacenDeProductos.get(1), 2); // Compra de "Libro"
	        AlmacenCosas.compras[2] = new Compra("16", LocalDate.now(), ListadoProducto.almacenDeProductos.get(9), 1); // Compra de "Mouse Pad RGB"
	        // Mostrando los recibos de las compras
	        for (Compra compra : AlmacenCosas.compras) {
	            compra.imprimirRecibo();
	        }
	    }
	
	}

