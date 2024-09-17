package ar.edu.ies6.informatica.punto01.main;

import ar.edu.ies6.informatica.punto01.model.Producto;
import ar.edu.ies6.informatica.punto01.util.Categoria;
import ar.edu.ies6.informatica.punto01.util.ListadoProducto;
import ar.edu.ies6.informatica.punto01.util.OrigenFabricacion;

public class Main {
    public static void main(String[] args) {
		        // Agregar productos al ArrayList en ListadoProductos
		 ListadoProducto.almacenDeProductos.add(new Producto("1", "Teléfono móvil", 50000.0, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
		 ListadoProducto.almacenDeProductos.add(new Producto("2", "Notebook", 150000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
		 ListadoProducto.almacenDeProductos.add(new Producto("3", "Aspiradora", 30000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
		 ListadoProducto.almacenDeProductos.add(new Producto("4", "Taladro", 20000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
		 ListadoProducto.almacenDeProductos.add(new Producto("5", "Monitor", 60000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
		 // Mostrar los productos
		  mostrarProductos();
		    }

  private static void mostrarProductos() {
      for (Producto producto : ListadoProducto.almacenDeProductos) {
		  System.out.println(producto);
		    }
	 }
  }

