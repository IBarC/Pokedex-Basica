package ui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

public class WelcomeView {

	private JFrame frame;
	private String user;
	private JLabel lblTitulo;
	private JLabel lblTitulo_1;

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

		frame.setBounds(100, 100, 667, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners() {
		
	}
}
