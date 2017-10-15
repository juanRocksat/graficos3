package example4;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class Graficadora {

	    //Importante, plano debe ser publico y estatico
	    public static Plano plano;
	    public static void main(String[] args) {
	        //Creando la ventana y el plano de dibujo
	        Ventana frame = new Ventana();
	        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
	        frame.setBounds(300, 300, 510, 600);
	        frame.setLayout(new BorderLayout());
	        plano = new Plano();
	        //Configuraci�n del Boton
	        JButton start = new JButton("Iniciar");
	        start.addActionListener(frame);
	        start.setText("Iniciar");
	        //Bordes al panel
	        frame.add( plano, BorderLayout.CENTER);
	        frame.add(start, BorderLayout.SOUTH);
	        frame.setVisible( true );
	    }
	}
