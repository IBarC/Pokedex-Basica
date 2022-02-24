package models;

import eum.Categoria;

public class Pokemon {
	public int numero;
	public String nombre;
	public String tipo;
	public double altura;
	public double peso;
	public String categoria;
	public String habilidad;
	
	public Pokemon(int numero, String nombre, String tipo, double altura, double peso, String categoria,
			String habilidad) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
//	public Categoria getCategoria() {
//		return categoria;
//	}
//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	@Override
	public String toString() {
		return "Pokemon [numero=" + numero + ", nombre=" + nombre + ", tipo=" + tipo + ", altura=" + altura + ", peso="
				+ peso + ", categoria=" + categoria + ", habilidad=" + habilidad + "]";
	}

	//Anterior a la base de datos
	
//	/**
//	 * Crear la clase Pokemon
//	 * 
//	 * @param numero
//	 * @param nombre
//	 * @param tipo
//	 * @param altura
//	 * @param peso
//	 * @param categoria
//	 * @param habilidad
//	 */
//	public Pokemon(int numero, String nombre, String tipo, double altura, double peso, Categoria categoria,
//			String habilidad) {
//		super();
//		this.numero = numero;
//		this.nombre = nombre;
//		this.tipo = tipo;
//		this.altura = altura;
//		this.peso = peso;
//		this.categoria = categoria;
//		this.habilidad = habilidad;
//	}
//
//	/**
//	 * Devuelve el número del pokemon
//	 * 
//	 * @return
//	 */
//	public int getNumero() {
//		return numero;
//	}
//
//	/**
//	 * Establece el número del pokemon
//	 * 
//	 * @param numero
//	 */
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
//
//	/**
//	 * Devuelve el nombre del pokemon
//	 * 
//	 * @return
//	 */
//	public String getNombre() {
//		return nombre;
//	}
//
//	/**
//	 * Establece el nombre del pokemon
//	 * 
//	 * @param nombre
//	 */
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	/**
//	 * Devuelve el tipo de pokemon
//	 * 
//	 * @return
//	 */
//	public String getTipo() {
//		return tipo;
//	}
//
//	/**
//	 * Establece el tipo de pokemon
//	 * 
//	 * @param tipo
//	 */
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//
//	/**
//	 * Devuelve la altura del pokemon
//	 * 
//	 * @return
//	 */
//	public double getAltura() {
//		return altura;
//	}
//
//	/**
//	 * Establece la altura del pokemon
//	 * 
//	 * @param altura
//	 */
//	public void setAltura(double altura) {
//		this.altura = altura;
//	}
//
//	/**
//	 * Devuelve el peso del pokemon
//	 * 
//	 * @return
//	 */
//	public double getPeso() {
//		return peso;
//	}
//
//	/**
//	 * Establece el peso del pokemon
//	 * @param peso
//	 */
//	public void setPeso(double peso) {
//		this.peso = peso;
//	}
//
//	/**
//	 * Devuelve la categoria del pokemon
//	 * @return
//	 */
//	public Categoria getCategoria() {
//		return categoria;
//	}
//
//	/**
//	 * Establece la categoria del pokemon
//	 * @param categoria
//	 */
//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}
//
//	/**
//	 * Devuelve la habilidad del pokemon
//	 * @return
//	 */
//	public String getHabilidad() {
//		return habilidad;
//	}
//
//	/**
//	 * Establece la habilidad del pokemon
//	 * @param habilidad
//	 */
//	public void setHabilidad(String habilidad) {
//		this.habilidad = habilidad;
//	}

}
