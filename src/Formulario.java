import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.awt.event.*;



public class Formulario extends JFrame {

    JFrame frame;
    JTable tabla1,tabla2,tabla3,tabla4,tabla5 = new JTable();
    JButton boton1,boton2,boton3,boton4,boton5,boton6;
    Requerimientos consultas =  new Requerimientos();

    
    

public Formulario () throws SQLException{


initFormulario();




}


private void initFormulario () throws SQLException{

frame = new JFrame("MATEMATICA MENTE");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600, 700);
frame.setResizable(false);



//Creamos el label del titulo
JPanel titulo = new JPanel();
titulo.setLayout(new FlowLayout(FlowLayout.CENTER));
JLabel etiqueta =new JLabel("RETO REALIZADO POR RAÚL SOTO VILLAMIZAR PARA SOFKA");
titulo.setFont(new Font("Arial",0, 100));
titulo.add(etiqueta);



//CONSTRUIMOS EL OBJETO JPANEL PARA ALBERGAR LA BOTONERA
JPanel Botonera = new JPanel();
//LE DECIMOS QUE ESE PANEL VA A TENER UN lAYOUT FLOWLAYOUT Y SUS COMPONENTES ESTARAN CENTRARDOS
Botonera.setLayout(new BoxLayout(Botonera, BoxLayout.Y_AXIS));


// CREO UNOS LABEL PARA DAR ESPACIOS ENTRE LOS BOTONES
JLabel espacio1 = new JLabel("          ");
JLabel espacio2 = new JLabel("          ");
JLabel espacio3 = new JLabel("          ");
JLabel espacio4 = new JLabel("          ");
JLabel espacio5 = new JLabel("          ");




//CONSTRUIMOS BOTONES
JButton boton1 = new JButton("NIVEL1");
JButton boton2 = new JButton("NIVEL2");
JButton boton3 = new JButton("NIVEL3");
JButton boton4 = new JButton("NIVEL4");
JButton boton5 = new JButton("NIVEL5");
JButton boton6 = new JButton("   Salir  ");


//ADICIONAMOS BOTONES AL PANEL
Botonera.add(espacio4);
Botonera.add(boton1);
Botonera.add(espacio1);
Botonera.add(boton2);
Botonera.add(espacio2);
Botonera.add(boton3);
Botonera.add(espacio3);
Botonera.add(boton4);
Botonera.add(espacio4);
Botonera.add(boton5);
Botonera.add(espacio5);
Botonera.add(boton6);


// CREAMOS LAS TABLAS Y LAS CABECERAS PARA SER USADAS DESPÚES

//PRIMERA CONSULTA
String[] nombres1 = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
tabla1 = new JTable(consultas.mostrar(), nombres1);

 // SEGUNDA CONSULTA
String[] nombres2 = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
tabla2 = new JTable(consultas.mostrar1(), nombres2);

//TERCERA CONSULTA
String[] nombres3 = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
tabla3 = new JTable(consultas.mostrar2(), nombres3);
//CUARTA CONSULTA
String[] nombres4 = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
tabla4 = new JTable(consultas.mostrar3(), nombres4);

//QUINTA CONSULTA
String[] nombres5 = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
tabla5 = new JTable(consultas.mostrar4(), nombres5);



// CREAMOS EL JSCROLLPANE QUE ES EL QUE ME ALBERGA LAS TABLAS
JScrollPane Panel = new JScrollPane();
Panel.setAlignmentY(Component.CENTER_ALIGNMENT);


        
//AGREGAMOS LOS PANELES AL PANEL BORDELAYOUT QUE SERÁ MI PRINCIPAL

frame. getContentPane().add(BorderLayout.LINE_START,Botonera);
frame. getContentPane().add(Panel, BorderLayout.CENTER);
frame. getContentPane().add(BorderLayout.NORTH, titulo);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame. setVisible(true);
frame.setLocationRelativeTo(null);

// CREAMOS LOS EVENTOS ACTIONLISTENER Y LOS ADICIONAMOS AL BOTÓN Y A LOS MENUITEM

 ActionListener consulta1 = new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae){

        Panel.add(tabla1);
        Panel.setViewportView(tabla1);
      
        
        
     }
 };

boton1.addActionListener(consulta1);
//MeI2.addActionListener(consulta1);


ActionListener consulta2 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla2);
       Panel.setViewportView(tabla2);
       
              
    }
};

boton2.addActionListener(consulta2);
//MeI3.addActionListener(consulta2);

ActionListener consulta3 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla3);
       Panel.setViewportView(tabla3);
       
              
    }
};

boton3.addActionListener(consulta3);
//MeI3.addActionListener(consulta2);

ActionListener consulta4 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla4);
       Panel.setViewportView(tabla4);
       
              
    }
};

boton4.addActionListener(consulta4);
//MeI3.addActionListener(consulta2);

ActionListener consulta5 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla5);
       Panel.setViewportView(tabla5);
       
              
    }
};

boton5.addActionListener(consulta5);
//MeI3.addActionListener(consulta2);





// EVENTO ACTIONLISTENER PARA SALIR 
ActionListener salir = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

        //CON ESTA LINEA DE CÓDIGO CERRAMOS LA APLICACIÓN
      salir();
       
    }
};


boton6.addActionListener(salir);
}
 

	private void salir(){
        int valor = JOptionPane.showConfirmDialog(this,"Quieres salir de la aplicación?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        		if (valor == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Gracias", "SALIR", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
	}
    }
		
