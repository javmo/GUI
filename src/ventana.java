import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana {

	private JFrame frame;
	private JTextField txtTramaBackend;
	private JButton btnGenerarTramaCoordinador;
	private JTextField txtTramaCoordinador;
	private JButton btnSeleccionarArchivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
//-----------------------------
					EjemploJFileChooser frame = new EjemploJFileChooser();
                    frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnGenerarTrama = new JButton("Generar trama backend");
		btnGenerarTrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnGenerarTrama = new GridBagConstraints();
		gbc_btnGenerarTrama.insets = new Insets(0, 0, 5, 0);
		gbc_btnGenerarTrama.gridx = 0;
		gbc_btnGenerarTrama.gridy = 0;
		frame.getContentPane().add(btnGenerarTrama, gbc_btnGenerarTrama);
		
		txtTramaBackend = new JTextField();
		txtTramaBackend.setText("Trama BackEnd");
		GridBagConstraints gbc_txtTramaBackend = new GridBagConstraints();
		gbc_txtTramaBackend.insets = new Insets(0, 0, 5, 0);
		gbc_txtTramaBackend.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTramaBackend.gridx = 0;
		gbc_txtTramaBackend.gridy = 1;
		frame.getContentPane().add(txtTramaBackend, gbc_txtTramaBackend);
		txtTramaBackend.setColumns(10);
		
		btnGenerarTramaCoordinador = new JButton("Generar trama coordinador");
		GridBagConstraints gbc_btnGenerarTramaCoordinador = new GridBagConstraints();
		gbc_btnGenerarTramaCoordinador.insets = new Insets(0, 0, 5, 0);
		gbc_btnGenerarTramaCoordinador.gridx = 0;
		gbc_btnGenerarTramaCoordinador.gridy = 2;
		frame.getContentPane().add(btnGenerarTramaCoordinador, gbc_btnGenerarTramaCoordinador);
		
		txtTramaCoordinador = new JTextField();
		txtTramaCoordinador.setText("Trama coordinador");
		GridBagConstraints gbc_txtTramaCoordinador = new GridBagConstraints();
		gbc_txtTramaCoordinador.insets = new Insets(0, 0, 5, 0);
		gbc_txtTramaCoordinador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTramaCoordinador.gridx = 0;
		gbc_txtTramaCoordinador.gridy = 3;
		frame.getContentPane().add(txtTramaCoordinador, gbc_txtTramaCoordinador);
		txtTramaCoordinador.setColumns(10);
		
		btnSeleccionarArchivo = new JButton("Seleccionar archivo");
		GridBagConstraints gbc_btnSeleccionarArchivo = new GridBagConstraints();
		gbc_btnSeleccionarArchivo.gridx = 0;
		gbc_btnSeleccionarArchivo.gridy = 6;
		frame.getContentPane().add(btnSeleccionarArchivo, gbc_btnSeleccionarArchivo);

	}

}
