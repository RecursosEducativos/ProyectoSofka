import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;






public class Principal extends JFrame  {

    
    JRadioButton seleccion1,seleccion2,seleccion3,seleccion4;
    ButtonGroup preguntas;
    JTable tabla1,tabla2,tabla3,tabla4,tabla5 = new JTable();
    JButton boton1,boton2,boton3,boton4,boton5,boton6;
    Requerimientos consultas =  new Requerimientos();
    Integer score=0;
    Integer i=0;
    JLabel pregunta;

    
    
    private static void initFormulario () throws SQLException{
    
      
    JFrame frame;
    frame = new JFrame("MATEMATICA MENTE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setResizable(false);
    
    
    
    //Creamos el label del titulo
    JPanel titulo = new JPanel();
    titulo.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel etiqueta =new JLabel("RETO REALIZADO POR RAÚL SOTO VILLAMIZAR PARA SOFKA");
    titulo.setFont(new Font("Arial",0, 100));
    titulo.add(etiqueta);
    
    
    
    //CONSTRUIMOS EL OBJETO JPANEL PARA ALBERGAR LA BOTONERA
    JPanel Botonera = new JPanel();
    JPanel Enunciado = new JPanel();
    
    //LE DECIMOS QUE ESE PANEL VA A TENER UN lAYOUT FLOWLAYOUT Y SUS COMPONENTES ESTARAN CENTRARDOS
    Botonera.setAlignmentX(Component.CENTER_ALIGNMENT);
    Botonera.setLayout(new BoxLayout(Botonera, BoxLayout.X_AXIS));
    Enunciado.setLayout(new BoxLayout(Enunciado, BoxLayout.Y_AXIS));
 
    
    
    
    // CREO UNOS LABEL PARA DAR ESPACIOS ENTRE LOS BOTONES Y EL ENUNCIADO
    JLabel espacio1 = new JLabel("Podrás escoger entre dos opciones de juego");
    JLabel espacio2 = new JLabel("1) Realizar toda la pruba de manera  unificada");
    JLabel espacio3 = new JLabel("2) Realizar la pruba por niveles de dificulta que podrás escoger si tienes los puntos suficientes para hacerlo          ");
    JLabel espacio4 = new JLabel("SUERTE!");
    JLabel espacio5 = new JLabel("                                                ");
    JLabel espacio6 = new JLabel("          ");
    JLabel espacio7 = new JLabel("                                             ");
   
    
        
    //CONSTRUIMOS BOTONES
    JButton boton1 = new JButton("PRUEBA UNIFICADA");
    JButton boton2 = new JButton("PRUEBA POR NIVELES");
    JButton boton3 = new JButton("   Salir  ");
    
    
    //creamos las opciones
    
    
    
    //ADICIONAMOS BOTONES AL PANEL
    Botonera.add(espacio5);
    Botonera.add(boton1);
    Botonera.add(espacio6);
    Botonera.add(boton2);
    Botonera.add(espacio7);
    Botonera.add(boton3);

    Enunciado.add(espacio1);
    Enunciado.add(espacio2);
    Enunciado.add(espacio3);
    Enunciado.add(espacio4);
    
    
    //AGREGAMOS LOS PANELES AL PANEL BORDELAYOUT QUE SERÁ MI PRINCIPAL
    
 
    frame. getContentPane().add(BorderLayout.SOUTH,Botonera);
    frame. getContentPane().add(Enunciado, BorderLayout.CENTER);
    frame. getContentPane().add(BorderLayout.NORTH, titulo);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame. setVisible(true);
    frame.setLocationRelativeTo(null);
    
    // CREAMOS LOS EVENTOS ACTIONLISTENER Y LOS ADICIONAMOS AL BOTÓN Y A LOS MENUITEM
    
    
    
    
    ActionListener consulta2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
    
           
           
                  
        }
    };
    
    boton2.addActionListener(consulta2);
    //MeI3.addActionListener(consulta2);
    
   
    
    // EVENTO ACTIONLISTENER PARA SALIR 
    ActionListener salir = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
    
            //CON ESTA LINEA DE CÓDIGO CERRAMOS LA APLICACIÓN
           //salir();
           
        }
    };
    
    
    boton3.addActionListener(salir);
    }
     
    
        private  void salir(){
            int valor = JOptionPane.showConfirmDialog(this,"Quieres salir de la aplicación?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                    if (valor == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Gracias", "SALIR", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
           
            }
            
        }
    
               
    public static void main(String[] args) throws SQLException  {

        
        Formulario ventana = new Formulario();
     


    }


   

}



