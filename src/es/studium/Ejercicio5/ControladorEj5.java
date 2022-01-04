package es.studium.Ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ControladorEj5 implements WindowListener, ActionListener
{
	 ModeloEj5 modelo = null;
     VistaEj5 vista = null;
     
     String texto;

     public ControladorEj5(ModeloEj5 modelo, VistaEj5 vista) {
             this.modelo = modelo;
             this.vista = vista;

             vista.ventana.addWindowListener(this);
             vista.btnDirectorios.addActionListener(this);
     }

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		try {
			Process process = Runtime.getRuntime().exec("cmd /c dir");
			// Flujo de entrada(padre) para la salida estándar (hijo) 
			InputStream is = process.getInputStream();
			// Flujo de lectura para esa entrada 
			InputStreamReader isr = new InputStreamReader(is); 
			// Buffer para leer línea a línea 
			BufferedReader br = new BufferedReader(isr); 
			String line; 
			while ((line = br.readLine()) != null) 
			{ 
				texto= vista.listadoDirectorios.getText();
				vista.listadoDirectorios.setText(texto+"\n"+line);
			} 
			is.close(); 
//			listadoDirectorios.setText(texto);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
