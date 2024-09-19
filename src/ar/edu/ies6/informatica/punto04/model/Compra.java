package ar.edu.ies6.informatica.punto04.model;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto01.model.Producto;

public class Compra {
	private String codigo;
	private LocalDate fechaDeCompra;
	private Producto producto;
	private Integer cantidad;
	
	public Compra(String codigo, LocalDate fechaDeCompra, Producto producto, Integer cantidad) {
		// TODO Auto-generated constructor stub
	this.codigo=codigo;
	this.fechaDeCompra=fechaDeCompra;
	this.producto=producto;
	this.cantidad=cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public void imprimirRecibo() {
        double total = producto.getPrecioUnitario() * cantidad;
        System.out.println("Código de Compra: " + codigo);
        System.out.println("Fecha de Compra: " + fechaDeCompra);
        System.out.println("Producto: " + producto.getDescripcion());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + producto.getPrecioUnitario());
        System.out.println("Total: $" + total);
        System.out.println("-----------------------------");
    }
}

