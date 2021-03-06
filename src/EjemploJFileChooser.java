
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
 
public class EjemploJFileChooser extends JFrame {
 
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;
 
    /**
     * Create the frame.
     */
    public EjemploJFileChooser() {
 
        //Parametros asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
 
        textField = new JTextField();
        textField.setToolTipText("Inserta la ruta del fichero de audio");
        textField.setBounds(52, 26, 209, 20);
        contentPane.add(textField);
        textField.setColumns(10);
 
        JButton btnSeleccionar = new JButton("Seleccionar...");
        btnSeleccionar.setBounds(288, 25, 109, 23);
        contentPane.add(btnSeleccionar);
 
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(52, 76, 360, 156);
 
        JScrollPane scroll=new JScrollPane(textArea);
        scroll.setBounds(52, 76, 360, 156);
        contentPane.add(scroll);
 
        btnSeleccionar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
//--------------accion del fichero            	
            	//Creamos el objeto JFileChooser
            	JFileChooser fc=new JFileChooser();
            	 
            	//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
            	int seleccion=fc.showOpenDialog(contentPane);
            	 
            	//Si el usuario, pincha en aceptar
            	if(seleccion==JFileChooser.APPROVE_OPTION){
            	 
            	    //Seleccionamos el fichero
            	    File fichero=fc.getSelectedFile();
            	 
            	    //Ecribe la ruta del fichero seleccionado en el campo de texto
            	    textField.setText(fichero.getAbsolutePath());
            	 
            	    try(FileReader fr=new FileReader(fichero)){
            	        String cadena="";
            	        int valor=fr.read();
            	        while(valor!=-1){
            	            cadena=cadena+(char)valor;
            	            valor=fr.read();
            	        }
            	        textArea.setText(cadena);
            	    } catch (IOException e1) {
            	        e1.printStackTrace();
            	    }
            	}
 
            }
        });
 
    }
}