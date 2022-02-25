package com.somosBooking.somosBack.productos;

public class producto {
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double price;
	private int stock;
	private String size;
	private int idColor;
	private static int total=0;
	private int id;
	public producto(String nombre, String descripcion, String uRL_imagen, double price, int stock, String size, int idColor) {
		super();
		total++;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.price = price;
		this.stock = stock;
		this.size = size;
		this.idColor = idColor;
		this.id = total;
	}
	public producto() {
		super();
		total++;
		this.id = total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getURL_imagen() {
		return URL_imagen;
	}
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getIdColor() {
		return idColor;
	}
	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen + ", price="
				+ price + ", stock=" + stock + ", size=" + size + ", idColor=" + idColor + ", id=" + id + "]";
	}
}
