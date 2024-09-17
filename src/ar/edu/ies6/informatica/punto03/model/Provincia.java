package ar.edu.ies6.informatica.punto03.model;

import ar.edu.ies6.informatica.punto03.util.Region;

public class Provincia {
	private int identificador;
	private String nombre;
	private Region región;
	private int poblacion;
	private Double superficie;
	private Boolean estado;

	public Provincia(int identificador, String nombre, Region región, int poblacion, double superficie, Boolean estado) {
	   this.identificador = identificador;
	   this.nombre = nombre;
	   this.región = región;
	   this.poblacion = poblacion;
	   this.superficie = superficie;
	   this.estado = estado;
	    }

	public int getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public Region getRegión() {
		return región;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public Boolean isEstado() {
		return estado;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRegión(Region región) {
		this.región = región;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public void isEstado(Boolean estado) {
		this.estado = estado;
	}
	// Método para calcular densidad poblacional
    public double calcularDensidadPoblacional() {
        if (superficie == 0) return 0; // Evitar división por cero
        return (double) poblacion / superficie;
        }

	@Override
	public String toString() {
		return "Provincia [identificador=" + identificador + ", nombre=" + nombre + ", región=" + región
				+ ", poblacion=" + poblacion + ", superficie=" + superficie + ", estado=" + estado + "]";
	}
	
}
	  
