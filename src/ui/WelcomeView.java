package ui;

import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeView {

	private JFrame frame;
	private String user;
	private JLabel lblTitulo;
	private JLabel lblTitulo_1;
	private JButton btnPokedex;
	private JButton btnCambiarNombre;
	private JButton btnCerrarSesion ;

	/**
	 * Create the application.
	 */
	public WelcomeView(String user) {
		this.user = user;
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(165, 42, 42));
		frame.getContentPane().setLayout(null);
		
		configureUIComponents();
		configureListeners();
	}
	
	private void configureUIComponents() {
		lblTitulo = new JLabel("Bienvenido " + this.user);
		lblTitulo.setForeground(Color.YELLOW);
		lblTitulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 42));
		lblTitulo.setBounds(10, 11, 588, 67);
		frame.getContentPane().add(lblTitulo);
		
		lblTitulo_1 = new JLabel("Bienvenido " + this.user);
		lblTitulo_1.setForeground(Color.BLUE);
		lblTitulo_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 42));
		lblTitulo_1.setBounds(15, 14, 588, 67);
		frame.getContentPane().add(lblTitulo_1);
		
		btnPokedex = new JButton("Pokedex");
		btnPokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPokedex.setBounds(250, 145, 121, 47);
		frame.getContentPane().add(btnPokedex);
		
		btnCambiarNombre = new JButton("Cambiar nombre");
		btnCambiarNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCambiarNombre.setBounds(220, 214, 176, 47);
		frame.getContentPane().add(btnCambiarNombre);
		
		btnCerrarSesion = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCerrarSesion.setBounds(243, 284, 136, 47);
		frame.getContentPane().add(btnCerrarSesion);

		frame.setBounds(100, 100, 667, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners() {
		btnPokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Pokedex(user, 0, frame);
				frame.setVisible(false);
			}
		});
	}
}
