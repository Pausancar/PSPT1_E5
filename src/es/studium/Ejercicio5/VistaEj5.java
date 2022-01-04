package es.studium.Ejercicio5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaEj5 //implements ActionListener
{
	Frame ventana = new Frame("ventana");
	TextField txtDireccion = new TextField(30);
	TextArea listadoDirectorios = new TextArea(16, 45);
	Button btnDirectorios = new Button("Mostrar Directorios");
	String texto="";
	
	public VistaEj5()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(350,400);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.add(txtDireccion);
		ventana.add(btnDirectorios);
		ventana.add(listadoDirectorios);
	}

//	@Override
//	public void actionPerformed(ActionEvent e)
//	{
//		// TODO Auto-generated method stub
//		
//	}

}
