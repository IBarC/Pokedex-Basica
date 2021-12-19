package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Pokemon;
import utils.Almacen;

import javax.swing.JButton;
import java.awt.event.ActionListener;
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
	private JButton btnAtr�s;
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

	/**
	 * Crea la aplicaci�n
	 * 
	 * @param usuario
	 * @param parent
	 * @param contPokemon
	 */
	public Pokedex(String usuario, JFrame parent, int contPokemon) {
		this.usuario = usuario;
		this.parent = parent;
		this.contPokemon = contPokemon;
		initialize();
		this.frPokedex.setVisible(true);
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

		btnAtr�s = new JButton("Atr\u00E1s");
		btnAtr�s.setBackground(Color.YELLOW);
		btnAtr�s.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtr�s.setForeground(Color.BLUE);
		btnAtr�s.setBounds(10, 157, 109, 23);
		frPokedex.getContentPane().add(btnAtr�s);

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

		lblMostrarNum = new JLabel(Almacen.pokemons.get(contPokemon).numero + "");
		lblMostrarNum.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarNum.setBounds(222, 129, 108, 23);
		frPokedex.getContentPane().add(lblMostrarNum);

		lblMostrarTipo = new JLabel(Almacen.pokemons.get(contPokemon).tipo);
		lblMostrarTipo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarTipo.setBounds(222, 182, 108, 23);
		frPokedex.getContentPane().add(lblMostrarTipo);

		lblMostrarPeso = new JLabel(Almacen.pokemons.get(contPokemon).peso + "");
		lblMostrarPeso.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarPeso.setBounds(222, 235, 108, 23);
		frPokedex.getContentPane().add(lblMostrarPeso);

		lblMostrarNom = new JLabel(Almacen.pokemons.get(contPokemon).nombre);
		lblMostrarNom.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarNom.setBounds(414, 129, 108, 23);
		frPokedex.getContentPane().add(lblMostrarNom);

		lblMostrarAlt = new JLabel(Almacen.pokemons.get(contPokemon).altura + "");
		lblMostrarAlt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarAlt.setBounds(414, 182, 108, 23);
		frPokedex.getContentPane().add(lblMostrarAlt);

		lblMostrarCat = new JLabel(Almacen.pokemons.get(contPokemon).getCategoria() + "");
		lblMostrarCat.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMostrarCat.setBounds(414, 235, 108, 23);
		frPokedex.getContentPane().add(lblMostrarCat);

		lblMostrarHab = new JLabel(Almacen.pokemons.get(contPokemon).habilidad);
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
				frPokedex.dispose();
				parent.setVisible(true);
			}
		});

		btnSigiente.addActionListener(new ActionListener() { // Que hace al darle a siguiente
			public void actionPerformed(ActionEvent e) {
				if (contPokemon + 1 == Almacen.pokemons.size()) {
					contPokemon = 0;
					frPokedex.dispose();
					new Pokedex(usuario, frPokedex, contPokemon);
				} else {
					contPokemon++;
					frPokedex.dispose();
					new Pokedex(usuario, frPokedex, contPokemon);
				}
			}
		});

		btnAtr�s.addActionListener(new ActionListener() { // Que hace al darle a atr�s
			public void actionPerformed(ActionEvent e) {
				if (contPokemon == 0) {
					contPokemon = Almacen.pokemons.size() - 1;
					frPokedex.dispose();
					new Pokedex(usuario, frPokedex, contPokemon);
				} else {
					contPokemon--;
					frPokedex.dispose();
					new Pokedex(usuario, frPokedex, contPokemon);
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

				JOptionPane.showMessageDialog(btnBorrar, "Pok�mon borrado :(");

				if (contPokemon == 0) {
					new Pokedex(usuario, frPokedex, 0);
				} else {
					new Pokedex(usuario, frPokedex, contPokemon - 1);
				}

			}
		});
	}
}
