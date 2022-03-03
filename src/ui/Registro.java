package ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

import models.Usuario;
import utils.Almacen;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import dao.UsuarioDAO;

public class Registro {

	private JFrame frRegistro;
	private JTextField inputUsu;
	private JLabel textoUsuario;
	private JLabel textoContr;
	private JLabel lblRepiteLaContrasea;
	private JButton registrate;
	private JLabel lblTitulo;
	private JButton btnAtras;
	private JPasswordField inputContr;
	private JPasswordField inputRepContr;
	private JFrame parent;
	private JLabel lblTitulo_2;
	private UsuarioDAO usuarioDAO;

	/**
	 * Crea la aplicación
	 * 
	 * @param parent
	 */
	public Registro(JFrame parent) {
		this.parent = parent;
		this.usuarioDAO = new UsuarioDAO();
		initialize();
		this.frRegistro.setVisible(true);
	}

	/**
	 * Initialize the frame.
	 */
	private void initialize() {
		frRegistro = new JFrame();
		frRegistro.getContentPane().setBackground(new Color(165, 42, 42));
		frRegistro.setBounds(100, 100, 667, 415);
		frRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frRegistro.getContentPane().setLayout(null);

		configureUIComponents();
		configureListeners();
	}

	/**
	 * Inicializa el contenido del frame
	 */
	private void configureUIComponents() {
		inputUsu = new JTextField();
		inputUsu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		inputUsu.setBounds(288, 158, 183, 26);
		frRegistro.getContentPane().add(inputUsu);
		inputUsu.setColumns(10);

		textoUsuario = new JLabel("Usuario: ");
		textoUsuario.setForeground(Color.LIGHT_GRAY);
		textoUsuario.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textoUsuario.setBounds(219, 158, 59, 26);
		frRegistro.getContentPane().add(textoUsuario);

		textoContr = new JLabel("Contrase\u00F1a:");
		textoContr.setForeground(Color.LIGHT_GRAY);
		textoContr.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textoContr.setBounds(196, 202, 82, 26);
		frRegistro.getContentPane().add(textoContr);

		lblRepiteLaContrasea = new JLabel("Repite la contrase\u00F1a:");
		lblRepiteLaContrasea.setForeground(Color.LIGHT_GRAY);
		lblRepiteLaContrasea.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblRepiteLaContrasea.setBounds(138, 246, 140, 26);
		frRegistro.getContentPane().add(lblRepiteLaContrasea);

		registrate = new JButton("Reg\u00EDstrate");
		registrate.setFont(new Font("Segoe UI", Font.BOLD, 14));
		registrate.setBounds(261, 315, 142, 29);
		frRegistro.getContentPane().add(registrate);

		lblTitulo = new JLabel("Crea un usuario");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.YELLOW);
		lblTitulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 45));
		lblTitulo.setBounds(97, 59, 473, 53);
		frRegistro.getContentPane().add(lblTitulo);

		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtras.setBounds(10, 342, 74, 23);
		frRegistro.getContentPane().add(btnAtras);

		inputContr = new JPasswordField();
		inputContr.setBounds(288, 202, 183, 26);
		frRegistro.getContentPane().add(inputContr);

		inputRepContr = new JPasswordField();
		inputRepContr.setBounds(288, 246, 183, 26);
		frRegistro.getContentPane().add(inputRepContr);

		lblTitulo_2 = new JLabel("Crea un usuario");
		lblTitulo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo_2.setForeground(Color.BLUE);
		lblTitulo_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 45));
		lblTitulo_2.setBounds(102, 62, 473, 53);
		frRegistro.getContentPane().add(lblTitulo_2);
	}

	/**
	 * Inicializa las acciones que se pueden realizar en el frame
	 */
	private void configureListeners() {
		registrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarContr();
			}
		});

		inputRepContr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarContr();
				}
			}
		});

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frRegistro.dispose();
				parent.setVisible(true);
			}
		});
	}

	/**
	 * Comprueba que las dos contraseñas introducidas son iguales
	 */
	private void comprobarContr() {
		String usuario = inputUsu.getText();
		String contr = new String(inputContr.getPassword());
		String contr2 = new String(inputRepContr.getPassword());

		if (contr.equals(contr2)) {
			if(usuario.isEmpty() || contr.isEmpty() || contr2.isEmpty()) {
				JOptionPane.showMessageDialog(registrate, "No puede haber campos vacios");
			} else if(usuarioDAO.buscarNombre(usuario)){
				JOptionPane.showMessageDialog(registrate, "El nombre de usuario ya existe");
				inputUsu.updateUI();
				inputContr.updateUI();
				inputRepContr.updateUI();
			} else {
				Usuario u = new Usuario(0, usuario, contr);
				usuarioDAO.register(u);
				JOptionPane.showMessageDialog(registrate, "Usuario creado");
				frRegistro.dispose();
				parent.setVisible(true);
			}
			//Almacen.usuarios.add(new Usuario(usuario, contr));
			
		} else {
			JOptionPane.showMessageDialog(registrate, "Las contraseñas no coinciden");
		}
	}
	
}
