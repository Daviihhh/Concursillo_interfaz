import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JTextField txtSiDabbidoJugara;
	public JLabel lblNewLabel;
	public JButton btnNewButton_4;
	public JButton btnNewButton_5;
	public JButton btnNewButton_6;
	public JButton btnNewButton_7;
	public JButton btnNewButton_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 247, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("A) Honkai");
		btnNewButton.setBackground(new Color(160, 254, 219));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(41, 247, 175, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("B) Un gacha de nintendo");
		btnNewButton_1.setBackground(new Color(160, 254, 219));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(290, 247, 175, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("C) Genshin");
		btnNewButton_2.setBackground(new Color(160, 254, 219));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(41, 281, 175, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("D) Ninguno, es de fracasados");
		btnNewButton_3.setBackground(new Color(160, 254, 219));
		btnNewButton_3.setBounds(290, 281, 175, 23);
		contentPane.add(btnNewButton_3);
		
		txtSiDabbidoJugara = new JTextField();
		txtSiDabbidoJugara.setBackground(new Color(160, 254, 219));
		txtSiDabbidoJugara.setText("Si dabbido jugara un gacha por lo que sea cual jugaria");
		txtSiDabbidoJugara.setBounds(85, 205, 337, 31);
		contentPane.add(txtSiDabbidoJugara);
		txtSiDabbidoJugara.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/ConcursilloLogo.png")));
		lblNewLabel.setBounds(208, 97, 85, 80);
		contentPane.add(lblNewLabel);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/escudo.png")));
		btnNewButton_4.setBounds(372, 11, 25, 24);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/llamada.png")));
		btnNewButton_5.setBounds(422, 11, 25, 24);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Eliminar.png")));
		btnNewButton_6.setBounds(471, 11, 25, 24);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		btnNewButton_7.setBounds(10, 11, 25, 24);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/verDinero.png")));
		btnNewButton_8.setBounds(56, 11, 25, 24);
		contentPane.add(btnNewButton_8);

	}
}
