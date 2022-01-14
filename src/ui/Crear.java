package ui;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import eum.Categoria;
import models.Pokemon;
import utils.Almacen;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Crear {

	private JFrame frCrear;
	private JLabel lblNumero;
	private JTextField textNum;
	private JTextField textTipo;
	private JTextField textPeso;
	private JTextField textHab;
	private JTextField textNombre;
	private JTextField textAltura;
	private JTextField textCategoria;
	private JLabel lblTipo;
	private JLabel lblNombre;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JLabel lblCategoria;
	private JLabel lblHabilidad;
	private JButton btnAtras;
	private JButton btnCrear;
	private JFrame parent;

	/**
	 * Crea la aplicación
	 * 
	 * @param parent
	 */
	public Crear(JFrame parent) {
		this.parent = parent;
		initialize();
		this.frCrear.setVisible(true);
	}

	/**
	 * Initialize the frame.
	 */
	private void initialize() {
		frCrear = new JFrame();
		frCrear.getContentPane().setBackground(new Color(165, 42, 42));
		frCrear.getContentPane().setForeground(new Color(0, 0, 0));
		frCrear.getContentPane().setLayout(null);

		configureUIComponents();
		configureListeners();
	}

	private void configureUIComponents() {
		lblNumero = new JLabel(" N\u00FAmero: ");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setForeground(Color.LIGHT_GRAY);
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNumero.setBounds(151, 129, 72, 23);
		frCrear.getContentPane().add(lblNumero);

		lblTipo = new JLabel(" Tipo: ");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setForeground(Color.LIGHT_GRAY);
		lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTipo.setBounds(151, 182, 72, 23);
		frCrear.getContentPane().add(lblTipo);

		lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setForeground(Color.LIGHT_GRAY);
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNombre.setBounds(351, 129, 72, 23);
		frCrear.getContentPane().add(lblNombre);

		lblAltura = new JLabel("Altura: ");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setForeground(Color.LIGHT_GRAY);
		lblAltura.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAltura.setBounds(351, 182, 72, 23);
		frCrear.getContentPane().add(lblAltura);

		lblPeso = new JLabel("Peso: ");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setForeground(Color.LIGHT_GRAY);
		lblPeso.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblPeso.setBounds(151, 235, 72, 23);
		frCrear.getContentPane().add(lblPeso);

		lblCategoria = new JLabel("Categor\u00EDa: ");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setForeground(Color.LIGHT_GRAY);
		lblCategoria.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblCategoria.setBounds(343, 235, 80, 23);
		frCrear.getContentPane().add(lblCategoria);

		lblHabilidad = new JLabel("Habilidad: ");
		lblHabilidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHabilidad.setForeground(Color.LIGHT_GRAY);
		lblHabilidad.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblHabilidad.setBounds(208, 288, 86, 23);
		frCrear.getContentPane().add(lblHabilidad);

		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtras.setBounds(10, 342, 96, 23);
		frCrear.getContentPane().add(btnAtras);

		textNum = new JTextField();
		textNum.setBounds(222, 132, 108, 20);
		frCrear.getContentPane().add(textNum);
		textNum.setColumns(10);

		textTipo = new JTextField();
		textTipo.setBounds(222, 185, 108, 20);
		frCrear.getContentPane().add(textTipo);
		textTipo.setColumns(10);

		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(222, 238, 108, 20);
		frCrear.getContentPane().add(textPeso);

		textHab = new JTextField();
		textHab.setColumns(10);
		textHab.setBounds(304, 291, 108, 20);
		frCrear.getContentPane().add(textHab);

		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(422, 132, 108, 20);
		frCrear.getContentPane().add(textNombre);

		textAltura = new JTextField();
		textAltura.setColumns(10);
		textAltura.setBounds(422, 185, 108, 20);
		frCrear.getContentPane().add(textAltura);

		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(422, 238, 108, 20);
		frCrear.getContentPane().add(textCategoria);

		btnCrear = new JButton("Crear");
		btnCrear.setBackground(Color.YELLOW);
		btnCrear.setForeground(Color.BLUE);
		btnCrear.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btnCrear.setBounds(476, 321, 129, 23);
		frCrear.getContentPane().add(btnCrear);
		frCrear.setBounds(100, 100, 667, 415);
		frCrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Inicializa las acciones que se puede realizar en el frame
	 */
	private void configureListeners() {
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearPok();
			}
		});

		textHab.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					crearPok();
				}
			}
		});

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frCrear.dispose();
				parent.setVisible(true);
			}
		});
	}

	/**
	 * Crea un nuevo pokémon y lo añade al arraList<Pokemons> en la posición
	 * correspondiente. Si el número del pokemon es el mayor de todos se añade al
	 * final, si no se añade en su sitio
	 */
	private void crearPok() {

		String cat = textCategoria.getText();
		boolean valido = false;
		int nPok = Integer.parseInt(textNum.getText());

		for (Categoria c : Categoria.values()) { // Comprobamos que el valor de categoria se encuentra en el enum
			if (c.name().equalsIgnoreCase(cat)) {
				valido = true;
			}
		}
		
		int max = Almacen.pokemons.get(0).numero;
		int i = 0;
		int pos=0;
		for(Pokemon p : Almacen.pokemons) {
			if (max < p.numero) {
				max = p.numero;
				pos = i;
			}
			i++;
		}

		if (nPok < max && valido) { // Creamos el pokemon en la posicion dada
			Almacen.pokemons.add((pos),
					new Pokemon(Integer.parseInt(textNum.getText()), textNombre.getText(), textTipo.getText(),
							Double.parseDouble(textAltura.getText()), Double.parseDouble(textPeso.getText()),
							Categoria.valueOf(cat), textHab.getText()));
			JOptionPane.showMessageDialog(btnCrear, "Pokémon creado :)");
			frCrear.dispose();
			parent.setVisible(true);
		} else if (nPok >= max && valido) { // Creamos el pokemon en la última posición del array
			Almacen.pokemons.add(new Pokemon(Integer.parseInt(textNum.getText()), textNombre.getText(),
					textTipo.getText(), Double.parseDouble(textAltura.getText()),
					Double.parseDouble(textPeso.getText()), Categoria.valueOf(cat), textHab.getText()));
			JOptionPane.showMessageDialog(btnCrear, "Pokémon creado :)");
			frCrear.dispose();
			parent.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(btnCrear, "Hay algún dato mal D:");
		}

	}

}
