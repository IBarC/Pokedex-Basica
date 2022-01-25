package ui;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import utils.Almacen;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

import dao.UsuarioDAO;
import models.Usuario;

public class Login {

	private JFrame frLogin;
	private JTextField inputUsu;
	private JLabel lblUsuario;
	private JLabel lblContr;
	private JLabel titulo;
	private JButton inicioS;
	private JButton registrarse;
	private JPasswordField inputContr;
	private JLabel titulo_1;
	private UsuarioDAO usuarioDAO;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		this.usuarioDAO = new UsuarioDAO();
		this.frLogin.setVisible(true);
	}

	/**
	 * Initialize the frame.
	 */
	private void initialize() {
		frLogin = new JFrame();
		frLogin.getContentPane().setBackground(new Color(165, 42, 42));
		frLogin.getContentPane().setLayout(null);

		configureUIComponents();
		configureListeners();
	}

	/**
	 * Inicializa el contenido del frame
	 */
	private void configureUIComponents() {
		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setForeground(new Color(192, 192, 192));
		lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblUsuario.setBounds(219, 170, 59, 26);
		frLogin.getContentPane().add(lblUsuario);

		inicioS = new JButton("Iniciar sesi\u00F3n");

		inicioS.setFont(new Font("Segoe UI", Font.BOLD, 14));
		inicioS.setBounds(261, 268, 142, 29);
		frLogin.getContentPane().add(inicioS);

		lblContr = new JLabel("Contrase\u00F1a:");
		lblContr.setForeground(new Color(192, 192, 192));
		lblContr.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblContr.setBounds(196, 207, 82, 26);
		frLogin.getContentPane().add(lblContr);

		registrarse = new JButton("Reg\u00EDstrate");
		registrarse.setFont(new Font("Segoe UI", Font.BOLD, 14));
		registrarse.setBounds(261, 317, 142, 29);
		frLogin.getContentPane().add(registrarse);

		titulo = new JLabel("POK\u00C9DEX");
		titulo.setForeground(Color.LIGHT_GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 60));
		titulo.setBounds(175, 60, 315, 67);
		frLogin.getContentPane().add(titulo);

		inputUsu = new JTextField();
		inputUsu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		inputUsu.setBounds(288, 170, 183, 26);
		frLogin.getContentPane().add(inputUsu);
		inputUsu.setColumns(10);

		inputContr = new JPasswordField();
		inputContr.setBounds(288, 207, 183, 26);
		frLogin.getContentPane().add(inputContr);

		titulo_1 = new JLabel("POK\u00C9DEX");
		titulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo_1.setForeground(Color.DARK_GRAY);
		titulo_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 60));
		titulo_1.setBounds(180, 63, 315, 67);
		frLogin.getContentPane().add(titulo_1);
		frLogin.setBounds(100, 100, 667, 415);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Inicializa las acciones que se puede realizar en el frame
	 */
	private void configureListeners() {
		inicioS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = inputUsu.getText();
				String password = new String(inputContr.getPassword());
				Usuario usuario = new Usuario(0, username, password);
				boolean compLogin = usuarioDAO.login(usuario);
				comprobarLogin(compLogin, username);
			}
		});

		inputContr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = inputUsu.getText();
					String password = new String(inputContr.getPassword());
					Usuario usuario = new Usuario(0, username, password);
					boolean compLogin = usuarioDAO.login(usuario);
					comprobarLogin(compLogin, username);
				}
			}
		});

		registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Registro(frLogin);
				frLogin.setVisible(false);
			}
		});
	}

	/**
	 * Comprueba que el usuario y la contraseña se encuentra dentro de los usuarios
	 * disponibles. Si es correcta te lleva a la pokedex de ese usuario
	 */
	private void comprobarLogin(boolean compLogin, String username) {

		int i = 0;
		boolean usuCorrecto = false;
		do {
			if (compLogin) {
				new WelcomeView(username);
				frLogin.setVisible(false); // Se oculta la visibilidad
				usuCorrecto = true;
			} else {
				i++;
			}
		} while (i < Almacen.usuarios.size() && !usuCorrecto);

		if (!usuCorrecto) {
			JOptionPane.showMessageDialog(inicioS, "Login incorrecto");
		}
	}
}
