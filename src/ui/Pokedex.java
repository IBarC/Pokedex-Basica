package ui;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import dao.PokemonDAO;
import models.Pokemon;
import utils.Almacen;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Pokedex {

	private JFrame frPokedex;
	private JLabel titulo;
	private String usuario;
	private JButton btnCerrarS;
	private JFrame parent;
	private JLabel titulo_1;
	private JButton btnSigiente;
	private JButton btnAtrás;
	private JLabel lblNumero;
	private JLabel lblTipo;
	private JLabel lblPeso;
	private JLabel lblNewLabel_3;
	private JLabel lblAltura;
	private JLabel lblCategoria;
	private JLabel lblHabilidad;
	private JButton btnCrear;
	private JButton btnActualizar;
	private JButton btnBorrar;
	private JLabel lblMostrarNum;
	private JLabel lblMostrarTipo;
	private JLabel lblMostrarPeso;
	private JLabel lblMostrarNom;
	private JLabel lblMostrarAlt;
	private JLabel lblMostrarCat;
	private JLabel lblMostrarHab;
	private int contPokemon;
	private PokemonDAO pokemonDAO;
	private ArrayList<Pokemon> pokemons;

	/**
	 * Crea la aplicación
	 * 
	 * @param usuario
	 * @param parent
	 * @param contPokemon
	 */
	public Pokedex(String usuario, int contPokemon, JFrame parent) {
		this.pokemonDAO = new PokemonDAO();
		this.pokemons = pokemonDAO.getAll();
		initialize();
		this.usuario = usuario;
		this.contPokemon = contPokemon;
		
		this.frPokedex.setVisible(true);
		this.parent = parent;
	}

	public void setParent(JFrame parent) {
		this.parent = parent;
	}

	/**
	 * Initialize the frame.
	 */
	private void initialize() {
		frPokedex = new JFrame();

		configureUIComponents();
		configureListeners();
	}

	/**
	 * Inicializa el contenido del frame
	 */
	private void configureUIComponents() {
		frPokedex.setBounds(100, 100, 667, 415);
		frPokedex.getContentPane().setBackground(new Color(165, 42, 42));
		frPokedex.getContentPane().setLayout(null);

		titulo = new JLabel("Pokedex de " + usuario);
		titulo.setForeground(Color.YELLOW);
		titulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 42));
		titulo.setBounds(10, 11, 588, 67);
		frPokedex.getContentPane().add(titulo);

		btnCerrarS = new JButton("Cerrar sesi\u00F3n");
		btnCerrarS.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCerrarS.setBounds(10, 342, 129, 23);
		frPokedex.getContentPane().add(btnCerrarS);

		titulo_1 = new JLabel("Pokedex de " + usuario);
		titulo_1.setForeground(Color.BLUE);
		titulo_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 42));
		titulo_1.setBounds(15, 14, 588, 67);
		frPokedex.getContentPane().add(titulo_1);

		btnSigiente = new JButton("Siguiente");
		btnSigiente.setBackground(Color.YELLOW);
		btnSigiente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnSigiente.setForeground(Color.BLUE);
		btnSigiente.setBounds(532, 157, 109, 23);
		frPokedex.getContentPane().add(btnSigiente);

		btnAtrás = new JButton("Atr\u00E1s");
		btnAtrás.setBackground(Color.YELLOW);
		btnAtrás.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtrás.setForeground(Color.BLUE);
		btnAtrás.setBounds(10, 157, 109, 23);
		frPokedex.getContentPane().add(btnAtrás);

		lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setForeground(new Color(192, 192, 192));
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNumero.setBounds(151, 129, 72, 23);
		frPokedex.getContentPane().add(lblNumero);

		lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.LIGHT_GRAY);
		lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTipo.setBounds(151, 182, 72, 23);
		frPokedex.getContentPane().add(lblTipo);

		lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.LIGHT_GRAY);
		lblPeso.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblPeso.setBounds(151, 235, 72, 23);
		frPokedex.getContentPane().add(lblPeso);

		lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(340, 129, 72, 23);
		frPokedex.getContentPane().add(lblNewLabel_3);

		lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(Color.LIGHT_GRAY);
		lblAltura.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAltura.setBounds(340, 182, 72, 23);
		frPokedex.getContentPane().add(lblAltura);

		lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setForeground(Color.LIGHT_GRAY);
		lblCategoria.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblCategoria.setBounds(340, 235, 72, 23);
		frPokedex.getContentPane().add(lblCategoria);

		lblHabilidad = new JLabel("Habilidad:");
		lblHabilidad.setForeground(Color.LIGHT_GRAY);
		lblHabilidad.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblHabilidad.setBounds(222, 288, 72, 23);
		frPokedex.getContentPane().add(lblHabilidad);

		btnCrear = new JButton("Crear");
		btnCrear.setForeground(new Color(211, 211, 211));
		btnCrear.setBackground(Color.DARK_GRAY);
		btnCrear.setBounds(532, 225, 109, 23);
		frPokedex.getContentPane().add(btnCrear);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(Color.DARK_GRAY);
		btnActualizar.setForeground(new Color(211, 211, 211));
		btnActualizar.setBounds(532, 278, 109, 23);
		frPokedex.getContentPane().add(btnActualizar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(Color.DARK_GRAY);
		btnBorrar.setForeground(new Color(211, 211, 211));
		btnBorrar.setBounds(532, 331, 109, 23);
		frPokedex.getContentPane().add(btnBorrar);

		lblMostrarNum = new JLabel(pokemons.get(contPokemon).numero + "");
		lblMostrarNum.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarNum.setBounds(222, 129, 108, 23);
		frPokedex.getContentPane().add(lblMostrarNum);

		lblMostrarTipo = new JLabel(pokemons.get(contPokemon).tipo);
		lblMostrarTipo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarTipo.setBounds(222, 182, 108, 23);
		frPokedex.getContentPane().add(lblMostrarTipo);

		lblMostrarPeso = new JLabel(pokemons.get(contPokemon).peso + "");
		lblMostrarPeso.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarPeso.setBounds(222, 235, 108, 23);
		frPokedex.getContentPane().add(lblMostrarPeso);

		lblMostrarNom = new JLabel(pokemons.get(contPokemon).nombre);
		lblMostrarNom.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarNom.setBounds(414, 129, 108, 23);
		frPokedex.getContentPane().add(lblMostrarNom);

		lblMostrarAlt = new JLabel(pokemons.get(contPokemon).altura + "");
		lblMostrarAlt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarAlt.setBounds(414, 182, 108, 23);
		frPokedex.getContentPane().add(lblMostrarAlt);

		lblMostrarCat = new JLabel(pokemons.get(contPokemon).categoria);
		lblMostrarCat.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarCat.setBounds(414, 235, 108, 23);
		frPokedex.getContentPane().add(lblMostrarCat);

		lblMostrarHab = new JLabel(pokemons.get(contPokemon).habilidad);
		lblMostrarHab.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarHab.setBounds(304, 288, 108, 23);
		frPokedex.getContentPane().add(lblMostrarHab);
		frPokedex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Inicializa las acciones que se puede realizar en el frame
	 */
	private void configureListeners() {
		btnCerrarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.setVisible(true);
				frPokedex.dispose();

			}
		});

		btnSigiente.addActionListener(new ActionListener() { // Que hace al darle a siguiente
			public void actionPerformed(ActionEvent e) {
				if (contPokemon + 1 == Almacen.pokemons.size()) {
					contPokemon = 0;
					frPokedex.dispose();
					new Pokedex(usuario, contPokemon, parent);
					setParent(frPokedex);
				} else {
					contPokemon++;
					frPokedex.dispose();
					new Pokedex(usuario, contPokemon, parent);
					setParent(frPokedex);
				}
			}
		});

		btnAtrás.addActionListener(new ActionListener() { // Que hace al darle a atrás
			public void actionPerformed(ActionEvent e) {
				if (contPokemon == 0) {
					contPokemon = Almacen.pokemons.size() - 1;
					frPokedex.dispose();
					new Pokedex(usuario, contPokemon, parent);
				} else {
					contPokemon--;
					frPokedex.dispose();
					new Pokedex(usuario, contPokemon, parent);
				}
			}
		});

		btnCrear.addActionListener(new ActionListener() { // Que hace al darle a crear
			public void actionPerformed(ActionEvent e) {
				frPokedex.dispose();
				new Crear(frPokedex);
			}
		});

		btnActualizar.addActionListener(new ActionListener() { // Que hace al darle a actualizar
			public void actionPerformed(ActionEvent e) {
				frPokedex.dispose();
				new Actualizar(frPokedex, contPokemon);
			}
		});

		btnBorrar.addActionListener(new ActionListener() { // Que hace al darle a borrar
			public void actionPerformed(ActionEvent e) {
				Almacen.pokemons.remove(contPokemon);

				JOptionPane.showMessageDialog(btnBorrar, "Pokémon borrado :(");

				if (contPokemon == 0) {
					new Pokedex(usuario, 0, parent);
				} else {
					new Pokedex(usuario, contPokemon - 1, parent);
				}

			}
		});
	}
}
