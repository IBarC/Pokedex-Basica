package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Pokemon;

public class PokemonDAO {

	final String DB_URL = "jdbc:mysql://localhost/Pokedex";
	final String USER = "Irene"; // Nombre de usuario que se crea en users and privileges
	final String PASS = "irene";

	public ArrayList<Pokemon> getAll() {
		final String QUERY = "SELECT id, nombre, tipo, altura, peso, categoria, habilidad from pokemons limit 1";
		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			while (rs.next()) {
				// Display values
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String tipo = rs.getString("tipo");
				Double altura = rs.getDouble("altura");
				Double peso = rs.getDouble("peso");
				String categoria = rs.getString("categoria");
				String habilidad = rs.getString("habilidad");
				Pokemon p = new Pokemon(id, nombre, tipo, altura, peso, categoria, habilidad);
				pokemons.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pokemons;
	}

}
