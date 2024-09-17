package ar.edu.ies6.informatica.punto02.model;

import ar.edu.ies6.informatica.punto02.util.Mes;

public class Efemeride {
		 private int codigo;
		    private String nombre;
		    private Mes mes;
		    private int dia;
		    private String detalle;

		    // Constructor
		    public Efemeride(int codigo, String nombre, Mes mes, int dia, String detalle) {
		        this.codigo = codigo;
		        this.nombre = nombre;
		        this.mes = mes;
		        this.dia = dia;
		        this.detalle = detalle;
		    }

		    // Getters y Setters
		    public int getCodigo() {
		        return codigo;
		    }

		    public void setCodigo(int codigo) {
		        this.codigo = codigo;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public Mes getMes() {
		        return mes;
		    }

		    public void setMes(Mes mes) {
		        this.mes = mes;
		    }

		    public int getDia() {
		        return dia;
		    }

		    public void setDia(int dia) {
		        this.dia = dia;
		    }

		    public String getDetalle() {
		        return detalle;
		    }

		    public void setDetalle(String detalle) {
		        this.detalle = detalle;
		    }

		    @Override
		    public String toString() {
		        return "Efemeride [codigo=" + codigo + ", nombre=" + nombre + ", mes=" + mes + ", dia=" + dia + ", detalle=" + detalle + "]";
		   }
}

