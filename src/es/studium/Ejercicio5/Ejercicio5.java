package es.studium.Ejercicio5;

public class Ejercicio5
{
//	Frame ventana = new Frame("ventana");
//	TextField txtDireccion = new TextField(30);
//	TextArea listadoDirectorios = new TextArea(16, 45);
//	Button btnDirectorios = new Button("Mostrar Directorios");
//	String texto="";

	public static void main(String[] args)
	{ 
		ModeloEj5 modelo = new ModeloEj5();
	    VistaEj5 vista = new VistaEj5();
	    new ControladorEj5(modelo, vista);
	}
	public Ejercicio5()
	{
//		btnDirectorios.addActionListener(this);
//		ventana.setLayout(new FlowLayout());
//		ventana.setSize(350,400);
//		ventana.setResizable(false);
//		ventana.setLocationRelativeTo(null);
//		ventana.setVisible(true);
//		ventana.add(txtDireccion);
//		ventana.add(btnDirectorios);
//		ventana.add(listadoDirectorios);
	}
//	@Override
//	public void actionPerformed(ActionEvent arg0)
//	{
//		try {
//			Process process = Runtime.getRuntime().exec("cmd /c dir"); 
//			// Flujo de entrada(padre) para la salida estándar (hijo) 
//			InputStream is = process.getInputStream();
//			// Flujo de lectura para esa entrada 
//			InputStreamReader isr = new InputStreamReader(is); 
//			// Buffer para leer línea a línea 
//			BufferedReader br = new BufferedReader(isr); 
//			String line; 
//			while ((line = br.readLine()) != null) 
//			{ 
//				texto= listadoDirectorios.getText();
//				vista.listadoDirectorios.setText(texto+"\n"+line);
//			} 
//			is.close(); 
////			listadoDirectorios.setText(texto);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
}
