package models;

import ui.Pokedex;

public class Usuario {
	
	private int id;
	private String usersname;
	private String password;
	
	public Usuario(int id, String usersname, String password) {
		super();
		this.id = id;
		this.usersname = usersname;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsersname() {
		return usersname;
	}
	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usersname=" + usersname + ", password=" + password + "]";
	}
	
	//Antes de la unión a la base de datos
//	public String nombre;
//	public String contr;
//	public Pokedex pokedex;
//
//	/**
//	 * Crea la clase Usuario
//	 * 
//	 * @param nombre
//	 * @param contr
//	 */
//	public Usuario(String nombre, String contr) {
//		super();
//		this.nombre = nombre;
//		this.contr = contr;
//	}
//
//	/**
//	 * Devuelve el valor de la pokedex
//	 * 
//	 * @return
//	 */
//	public Pokedex getPokedex() {
//		return pokedex;
//	}
//
//	/**
//	 * Establece un valor para la pokedex
//	 * 
//	 * @param pokedex
//	 */
//	public void setPokedex(Pokedex pokedex) {
//		this.pokedex = pokedex;
//	}
//
//	/**
//	 * Devuelve el nombre de usuario
//	 * 
//	 * @return
//	 */
//	public String getNombre() {
//		return nombre;
//	}
//
//	/**
//	 * Establece el nombre de usuario
//	 * 
//	 * @param nombre
//	 */
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	/**
//	 * Devuelve la contraseña del usuario
//	 * 
//	 * @return
//	 */
//	public String getContr() {
//		return contr;
//	}
//
//	/**
//	 * Establece la contraseña de un usuario
//	 * 
//	 * @param contr
//	 */
//	public void setContr(String contr) {
//		this.contr = contr;
//	}

}
