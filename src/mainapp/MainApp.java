package mainapp;

import eum.Categoria;
import models.Pokemon;
import models.Usuario;
import ui.Login;
import utils.Almacen;

public class MainApp {

	public static void main(String[] args) {

		// Pokemosn y usuarios ya creados
		// numero; nombre; tipo; altura; peso; categoria; habilidad
		Almacen.pokemons.add(new Pokemon(1, "Bulbasur", "Planta", 0.5, 9.0, Categoria.Tortuguita, "Torrente"));
		Almacen.pokemons.add(new Pokemon(4, "Charmander", "Fuego", 0.6, 8.5, Categoria.Lagartija, "MarLlamas"));
		Almacen.pokemons.add(new Pokemon(7, "Squirtle", "Agua", 0.6, 8.5, Categoria.Lagartija, "MarLlamas"));

		Almacen.usuarios.add(new Usuario("a", "a"));
		Almacen.usuarios.add(new Usuario("b", "b"));

		new Login(); // Emplieza el programa

	}
}
