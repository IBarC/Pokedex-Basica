package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;

import Eum.Categoria;
import utils.Almacen;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actualizar {

	private JFrame frAct;
	private JTextField txtNum;
	private JTextField textTipo;
	private JTextField textPeso;
	private JTextField textHab;
	private JTextField textNom;
	private JTextField textAlt;
	private JTextField textCat;
	private JButton btnAtras;
	private JLabel lblNumero;
	private JLabel lblTipo;
	private JLabel lblPeso;
	private JLabel lblHabilidad;
	private JLabel lblNombre;
	private JLabel lblAltura;
	private JLabel lblCategoria;
	private JButton btnAct;
	private int contPok;
	private JFrame parent;

	/**
	 * Crea la aplicación
	 * 
	 * @param parent
	 * @param contPok
	 */
	public Actualizar(JFrame parent, int contPok) {
		this.parent = parent;
		this.contPok = contPok;
		initialize();
		this.frAct.setVisible(true);
	}

	/**
	 * Initialize the frame.
	 */
	private void initialize() {
		frAct = new JFrame();
		frAct.getContentPane().setBackground(new Color(165, 42, 42));
		frAct.setBounds(100, 100, 667, 415);
		frAct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frAct.getContentPane().setLayout(null);

		confiugureUIComponents();
		configureListeners();
	}

	/**
	 * Inicializa el contenido del frame
	 */
	private void confiugureUIComponents() {
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtras.setBounds(10, 342, 96, 23);
		frAct.getContentPane().add(btnAtras);

		lblNumero = new JLabel(" N\u00FAmero: ");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setForeground(Color.LIGHT_GRAY);
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNumero.setBounds(151, 129, 72, 23);
		frAct.getContentPane().add(lblNumero);

		txtNum = new JTextField();
		txtNum.setText(Integer.toString(Almacen.pokemons.get(contPok).numero));
		txtNum.setColumns(10);
		txtNum.setBounds(222, 132, 108, 20);
		frAct.getContentPane().add(txtNum);

		lblTipo = new JLabel(" Tipo: ");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setForeground(Color.LIGHT_GRAY);
		lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTipo.setBounds(151, 182, 72, 23);
		frAct.getContentPane().add(lblTipo);

		textTipo = new JTextField();
		textTipo.setText(Almacen.pokemons.get(contPok).getTipo());
		textTipo.setColumns(10);
		textTipo.setBounds(222, 185, 108, 20);
		frAct.getContentPane().add(textTipo);

		lblPeso = new JLabel("Peso: ");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setForeground(Color.LIGHT_GRAY);
		lblPeso.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblPeso.setBounds(151, 235, 72, 23);
		frAct.getContentPane().add(lblPeso);

		textPeso = new JTextField();
		textPeso.setText(String.valueOf(Almacen.pokemons.get(contPok).getPeso()));
		textPeso.setColumns(10);
		textPeso.setBounds(222, 238, 108, 20);
		frAct.getContentPane().add(textPeso);

		lblHabilidad = new JLabel("Habilidad: ");
		lblHabilidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHabilidad.setForeground(Color.LIGHT_GRAY);
		lblHabilidad.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblHabilidad.setBounds(208, 288, 86, 23);
		frAct.getContentPane().add(lblHabilidad);

		textHab = new JTextField();
		textHab.setText(Almacen.pokemons.get(contPok).getHabilidad());
		textHab.setColumns(10);
		textHab.setBounds(304, 291, 108, 20);
		frAct.getContentPane().add(textHab);

		lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setForeground(Color.LIGHT_GRAY);
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNombre.setBounds(351, 129, 72, 23);
		frAct.getContentPane().add(lblNombre);

		textNom = new JTextField();
		textNom.setText(Almacen.pokemons.get(contPok).getNombre());
		textNom.setColumns(10);
		textNom.setBounds(422, 132, 108, 20);
		frAct.getContentPane().add(textNom);

		lblAltura = new JLabel("Altura: ");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setForeground(Color.LIGHT_GRAY);
		lblAltura.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAltura.setBounds(351, 182, 72, 23);
		frAct.getContentPane().add(lblAltura);

		textAlt = new JTextField();
		textAlt.setText(String.valueOf(Almacen.pokemons.get(contPok).getAltura()));
		textAlt.setColumns(10);
		textAlt.setBounds(422, 185, 108, 20);
		frAct.getContentPane().add(textAlt);

		lblCategoria = new JLabel("Categor\u00EDa: ");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setForeground(Color.LIGHT_GRAY);
		lblCategoria.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblCategoria.setBounds(343, 235, 80, 23);
		frAct.getContentPane().add(lblCategoria);

		textCat = new JTextField();
		textCat.setText(String.valueOf(Almacen.pokemons.get(contPok).getCategoria()));
		textCat.setColumns(10);
		textCat.setBounds(422, 238, 108, 20);
		frAct.getContentPane().add(textCat);

		btnAct = new JButton("Actualizar");
		btnAct.setForeground(Color.BLUE);
		btnAct.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btnAct.setBackground(Color.YELLOW);
		btnAct.setBounds(476, 321, 129, 23);
		frAct.getContentPane().add(btnAct);
	}

	/**
	 * Inicializa las acciones que se pueden realizar en el frame
	 */
	private void configureListeners() {
		btnAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frAct.dispose();
				parent.setVisible(true);
			}
		});
	}

	/**
	 * Actualiza el valor que ha cambiado en el pokemon
	 */
	private void actualizar() {
		Almacen.pokemons.get(contPok).setNumero(Integer.parseInt(txtNum.getText()));
		Almacen.pokemons.get(contPok).setNombre(textNom.getText());
		Almacen.pokemons.get(contPok).setTipo(textTipo.getText());
		Almacen.pokemons.get(contPok).setAltura(Double.parseDouble(textAlt.getText()));
		Almacen.pokemons.get(contPok).setPeso(Double.parseDouble(textPeso.getText()));
		Almacen.pokemons.get(contPok).setHabilidad(textHab.getText());

		String cat = textCat.getText();
		boolean valido = false;

		for (Categoria c : Categoria.values()) {
			if (c.name().equalsIgnoreCase(cat)) {
				Almacen.pokemons.get(contPok).setCategoria(Categoria.valueOf(cat));
				JOptionPane.showMessageDialog(btnAct, "Pokémon actualizado");
				frAct.dispose();
				parent.setVisible(true);
				valido = true;
			}
		}
		if (!valido) {
			JOptionPane.showMessageDialog(btnAct, "Hay algún dato mal");
		}
	}
}
