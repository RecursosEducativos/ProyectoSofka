import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import java.awt.event.*;



public class Formulario extends JFrame {

    JFrame frame;
    JRadioButton seleccion1,seleccion2,seleccion3,seleccion4;
    ButtonGroup preguntas;
    JTable tabla1,tabla2,tabla3,tabla4,tabla5 = new JTable();
    JButton boton1,boton2,boton3,boton4,boton5,boton6;
    Requerimientos consultas =  new Requerimientos();
    Integer score=0;
    Integer i=0;
    Integer I=0;
    Integer P=0;
    JLabel pregunta;
    ArrayList<Integer> Azar1=new ArrayList<Integer>();
    String permiso="si";
    String respuestaUsuario,preguntacorrecta,valor1,valor2,rta;
    
public Formulario () throws SQLException{


initFormulario();




}



private void initFormulario () throws SQLException{

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
JPanel Botonera2 = new JPanel();
JPanel Enunciado = new JPanel();

//LE DECIMOS QUE ESE PANEL VA A TENER UN lAYOUT FLOWLAYOUT Y SUS COMPONENTES ESTARAN CENTRARDOS
Botonera.setLayout(new BoxLayout(Botonera, BoxLayout.Y_AXIS));
Botonera2.setLayout(new BoxLayout(Botonera2, BoxLayout.X_AXIS));
Enunciado.setLayout(new BoxLayout(Enunciado, BoxLayout.Y_AXIS));
Botonera2.setAlignmentX(Component.CENTER_ALIGNMENT);



// CREO UNOS LABEL PARA DAR ESPACIOS ENTRE LOS BOTONES
JLabel espacio1 = new JLabel("          ");
JLabel espacio2 = new JLabel("          ");
JLabel espacio3 = new JLabel("          ");
JLabel espacio4 = new JLabel("          ");
JLabel espacio5 = new JLabel("          ");
JLabel espacio6 = new JLabel("          ");
JLabel espacio7 = new JLabel("                                             ");
JLabel espacio8 = new JLabel("          ");
JLabel puntos = new JLabel(" PUNTOS   :"+ score);
puntos.setFont(new Font("Arial",0, 25));





//CONSTRUIMOS BOTONES
JButton boton1 = new JButton("NIVEL1");
JButton boton2 = new JButton("NIVEL2");
JButton boton3 = new JButton("NIVEL3");
JButton boton4 = new JButton("NIVEL4");
JButton boton5 = new JButton("NIVEL5");
JButton boton6 = new JButton("   SALIR  ");
JButton boton7 = new JButton("EMPEZAR");

//DESHABILITO LOS BOTONES SOLO PODRAN ACCEDER A ELLOS CUANDO TENGA LA PUNTUACION REQUERIDA
//PARA CADA NIVEL
boton1.setEnabled(true);
boton2.setEnabled(false);
boton3.setEnabled(false);
boton4.setEnabled(false);
boton5.setEnabled(false);
boton7.setEnabled(false);


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
Botonera2.add(espacio7);
Botonera2.add(boton7);
Botonera2.add(espacio6);
Botonera2.add(boton6);
Botonera2.add(espacio8);
Botonera2.add(puntos);

// CREAMOS EL JSCROLLPANE QUE ES EL QUE ME ALBERGA LAS PREGUNTAS
JScrollPane Panel = new JScrollPane();
Panel.setAlignmentY(Component.CENTER_ALIGNMENT);


        
//AGREGAMOS LOS PANELES AL PANEL BORDELAYOUT QUE SERÁ MI PRINCIPAL

frame. getContentPane().add(BorderLayout.LINE_START,Botonera);
frame. getContentPane().add(BorderLayout.SOUTH,Botonera2);
frame. getContentPane().add(Panel, BorderLayout.CENTER);
frame. getContentPane().add(BorderLayout.NORTH, titulo);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame. setVisible(true);
frame.setLocationRelativeTo(null);

// CREAMOS LOS EVENTOS ACTIONLISTENER Y LOS ADICIONAMOS AL BOTÓN 

 
        
String[][] answer0=(consultas.mostrar5());

ActionListener consulta1= new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){
           

        boton7.setText("COMPROBAR");
        boton7.setEnabled(true);
        ArrayList<Integer> select=new ArrayList<Integer>();
        Azar1.clear();
        select.add(3);
        select.add(4);
        select.add(5);
        select.add(6);
        int j,z;
        for (j=0; j<4; j++) {
            var aleatorio = Math.floor(Math.random()*(select.size()));
            int seleccionAzar = select.get((int)aleatorio);
            z = select.indexOf(seleccionAzar);
            select.remove(z);

           /*  System.out.println("primer numero aleatorio:" + seleccionAzar);
            System.out.println("primer numero z:" + z);
            System.out.println("elementos de select :"+ select); */
            Azar1.add(seleccionAzar);

            // var aleatorio = Math.floor(Math.random()*(seleccion.length));
            // int seleccionAzar = seleccion[(int)aleatorio];
            // trace(seleccion);
          
            
           
            //System.out.println(aleatorio);
          
        
            // Sistem.out.println(seleccion);   
            
            System.out.println("longitud de Azar es: " + Azar1);
        }
       
        JLabel pregunta=new JLabel(answer0[i][(P)]+" )   "+answer0[i][2]);
        seleccion1=new JRadioButton("A )  "+answer0[i][Azar1.get(0)]);
        seleccion2=new JRadioButton("B )  "+answer0[i][Azar1.get(1)]);
        seleccion3=new JRadioButton("C )  "+answer0[i][Azar1.get(2)]);
        seleccion4=new JRadioButton("D )  "+answer0[i][Azar1.get(3)]);
        
        
        preguntas=new ButtonGroup();
        
        preguntas.add(seleccion1);
        preguntas.add(seleccion2);
        preguntas.add(seleccion3);
        preguntas.add(seleccion4);
        Enunciado.add(pregunta);
        Enunciado.add(seleccion1);
        Enunciado.add(seleccion2);
        Enunciado.add(seleccion3);
        Enunciado.add(seleccion4);
        
        Panel.add(Enunciado);
        Panel.setViewportView(Enunciado);
        I=1;
      
      
        
     }
 };

boton1.addActionListener(consulta1);
String[][] answer1=(consultas.mostrar1());
    ActionListener consulta2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            boton7.setText("COMPROBAR");
            ArrayList<Integer> select=new ArrayList<Integer>();
            Azar1.clear();
            select.add(3);
            select.add(4);
            select.add(5);
            select.add(6);
            int j,z;
            for (j=0; j<4; j++) {
                var aleatorio = Math.floor(Math.random()*(select.size()));
                int seleccionAzar = select.get((int)aleatorio);
                z = select.indexOf(seleccionAzar);
                select.remove(z);
    
               /*  System.out.println("primer numero aleatorio:" + seleccionAzar);
                System.out.println("primer numero z:" + z);
                System.out.println("elementos de select :"+ select); */
                Azar1.add(seleccionAzar);
    
                // var aleatorio = Math.floor(Math.random()*(seleccion.length));
                // int seleccionAzar = seleccion[(int)aleatorio];
                // trace(seleccion);
              
                
               
                //System.out.println(aleatorio);
              
            
                // Sistem.out.println(seleccion);   
                
                System.out.println("longitud de Azar es: " + Azar1);
            }
           
            JLabel pregunta=new JLabel(answer1[i][(P)]+" )   "+answer1[i][2]);
            seleccion1=new JRadioButton("A )  "+answer1[i][Azar1.get(0)]);
            seleccion2=new JRadioButton("B )  "+answer1[i][Azar1.get(1)]);
            seleccion3=new JRadioButton("C )  "+answer1[i][Azar1.get(2)]);
            seleccion4=new JRadioButton("D )  "+answer1[i][Azar1.get(3)]);
            
            
            preguntas=new ButtonGroup();
            
            preguntas.add(seleccion1);
            preguntas.add(seleccion2);
            preguntas.add(seleccion3);
            preguntas.add(seleccion4);
            Enunciado.add(pregunta);
            Enunciado.add(seleccion1);
            Enunciado.add(seleccion2);
            Enunciado.add(seleccion3);
            Enunciado.add(seleccion4);
            
            Panel.add(Enunciado);
            Panel.setViewportView(Enunciado);
            //ASIGNO EL VALOR DE 22 PARA SEGUIR EN EL CONSECUTIVO DE LAS PREGUNTAS GLOBALES
            I=6; 
        }
};

boton2.addActionListener(consulta2);


        String[][] answer2=(consultas.mostrar2());
        ActionListener consulta3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                boton7.setText("COMPROBAR");
                ArrayList<Integer> select=new ArrayList<Integer>();
                Azar1.clear();
                select.add(3);
                select.add(4);
                select.add(5);
                select.add(6);
                int j,z;
                for (j=0; j<4; j++) {
                    var aleatorio = Math.floor(Math.random()*(select.size()));
                    int seleccionAzar = select.get((int)aleatorio);
                    z = select.indexOf(seleccionAzar);
                    select.remove(z);
        
                    Azar1.add(seleccionAzar);
        
                    System.out.println("longitud de Azar es: " + Azar1);
                }
               
                JLabel pregunta=new JLabel(answer2[i][(P)]+" )   "+answer2[i][2]);
                seleccion1=new JRadioButton("A )  "+answer2[i][Azar1.get(0)]);
                seleccion2=new JRadioButton("B )  "+answer2[i][Azar1.get(1)]);
                seleccion3=new JRadioButton("C )  "+answer2[i][Azar1.get(2)]);
                seleccion4=new JRadioButton("D )  "+answer2[i][Azar1.get(3)]);
                
                
                preguntas=new ButtonGroup();
                
                preguntas.add(seleccion1);
                preguntas.add(seleccion2);
                preguntas.add(seleccion3);
                preguntas.add(seleccion4);
                Enunciado.add(pregunta);
                Enunciado.add(seleccion1);
                Enunciado.add(seleccion2);
                Enunciado.add(seleccion3);
                Enunciado.add(seleccion4);
                
                Panel.add(Enunciado);
                Panel.setViewportView(Enunciado);
                //ASIGNO EL VALOR DE 11 PARA SEGUIR EN EL CONSECUTIVO DE LAS PREGUNTAS GLOBALES
                I=11; 
            }
 
};

boton3.addActionListener(consulta3);




    //AQUI SE PROBO LA FUNCION 
    //rando();
    String[][] answer3=(consultas.mostrar3());
    ActionListener consulta4 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            boton7.setText("COMPROBAR");
            ArrayList<Integer> select=new ArrayList<Integer>();
            Azar1.clear();
            select.add(3);
            select.add(4);
            select.add(5);
            select.add(6);
            int j,z;
            for (j=0; j<4; j++) {
                var aleatorio = Math.floor(Math.random()*(select.size()));
                int seleccionAzar = select.get((int)aleatorio);
                z = select.indexOf(seleccionAzar);
                select.remove(z);
    
                Azar1.add(seleccionAzar);
    
                System.out.println("longitud de Azar es: " + Azar1);
            }
           
            JLabel pregunta=new JLabel(answer3[i][(P)]+" )   "+answer3[i][2]);
            seleccion1=new JRadioButton("A )  "+answer3[i][Azar1.get(0)]);
            seleccion2=new JRadioButton("B )  "+answer3[i][Azar1.get(1)]);
            seleccion3=new JRadioButton("C )  "+answer3[i][Azar1.get(2)]);
            seleccion4=new JRadioButton("D )  "+answer3[i][Azar1.get(3)]);
            
            
            preguntas=new ButtonGroup();
            
            preguntas.add(seleccion1);
            preguntas.add(seleccion2);
            preguntas.add(seleccion3);
            preguntas.add(seleccion4);
            Enunciado.add(pregunta);
            Enunciado.add(seleccion1);
            Enunciado.add(seleccion2);
            Enunciado.add(seleccion3);
            Enunciado.add(seleccion4);
            
            Panel.add(Enunciado);
            Panel.setViewportView(Enunciado);
            //ASIGNO EL VALOR DE 16 PARA SEGUIR EN EL CONSECUTIVO DE LAS PREGUNTAS GLOBALES
            I=16; 
        }

    
};

boton4.addActionListener(consulta4);
//MeI3.addActionListener(consulta2);
String[][] answer4=(consultas.mostrar4());
ActionListener consulta5 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){
        boton7.setText("COMPROBAR");
        ArrayList<Integer> select=new ArrayList<Integer>();
        Azar1.clear();
        select.add(3);
        select.add(4);
        select.add(5);
        select.add(6);
        int j,z;
        for (j=0; j<4; j++) {
            var aleatorio = Math.floor(Math.random()*(select.size()));
            int seleccionAzar = select.get((int)aleatorio);
            z = select.indexOf(seleccionAzar);
            select.remove(z);

            Azar1.add(seleccionAzar);

        }
       
        JLabel pregunta=new JLabel(answer4[i][(P)]+" )   "+answer4[i][2]);
        seleccion1=new JRadioButton("A )  "+answer4[i][Azar1.get(0)]);
        seleccion2=new JRadioButton("B )  "+answer4[i][Azar1.get(1)]);
        seleccion3=new JRadioButton("C )  "+answer4[i][Azar1.get(2)]);
        seleccion4=new JRadioButton("D )  "+answer4[i][Azar1.get(3)]);
        
        
        preguntas=new ButtonGroup();
        
        preguntas.add(seleccion1);
        preguntas.add(seleccion2);
        preguntas.add(seleccion3);
        preguntas.add(seleccion4);
        Enunciado.add(pregunta);
        Enunciado.add(seleccion1);
        Enunciado.add(seleccion2);
        Enunciado.add(seleccion3);
        Enunciado.add(seleccion4);
        
        Panel.add(Enunciado);
        Panel.setViewportView(Enunciado);
        //ASIGNO EL VALOR DE 21 PARA SEGUIR EN EL CONSECUTIVO DE LAS PREGUNTAS GLOBALES
        I=21; 
    }
};
    boton5.addActionListener(consulta5);
//MeI3.addActionListener(consulta2);

String[][] answer=(consultas.mostrar());

ActionListener comprobar = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){
        //POR MEDIO DEL EVENTO DEL ACTIONLISTENER DEL BOTON PODEMOS CAPTURAR LA OPCION ESCOGIDA
        //POR EL USUARIO
        System.out.println(Azar1.indexOf(3));
        System.out.println(Azar1);
        if(seleccion1.isSelected()){
            respuestaUsuario=seleccion1.getText().toString();
            if(Azar1.indexOf(3)==0){
               rta="correcto";
               JOptionPane.showMessageDialog(null,"Correcto su respuesta es :"+ respuestaUsuario, "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                rta="incorrecto";
             }
      
            
         } else if(seleccion2.isSelected()){
                respuestaUsuario=seleccion2.getText().toString();
           
                 
                 if(Azar1.indexOf(3)==1){
                    rta="correcto";
                    JOptionPane.showMessageDialog(null,"Correcto su respuesta es :"+ respuestaUsuario, "OK", JOptionPane.INFORMATION_MESSAGE);
                     }
                     else{
                        rta="incorrecto";
                        
                     }
            }
                else if(seleccion3.isSelected()){
                    respuestaUsuario=seleccion3.getText().toString();
          
                     
                     if(Azar1.indexOf(3)==2){
                        rta="correcto";
                        JOptionPane.showMessageDialog(null,"Correcto su respuesta es :"+ respuestaUsuario, "OK", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        rta="incorrecto";
                     }
                    
                }
                
                    else {
                        respuestaUsuario=seleccion4.getText().toString();
                        
                         
                         if(Azar1.indexOf(3)==3){
                            rta="correcto";
                            JOptionPane.showMessageDialog(null,"Correcto su respuesta es :"+ respuestaUsuario, "OK", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            rta="incorrecto";
                         }
                        
                    }
                    
                          
    

      
       
        //String preguntacorrecta=answer[i][3];
        //CONDICION QUE COMPARA LA RESPUESTA DEL USUARIO CON LA CORRECTA GUARDADA
        //EN EL ARRAY TRAIDO DEL REQUERIMIENTO HECHO A LA BD
        //SI ES CORRECTA LA RESPUESTA PASARA A LA SIGUIETE PREGUNTA DE LO CONTRARIO
        //SALDRA DEL PROGRAMA Y VISUALIZARA LOS PUNTOS

        /*  ESTE BLOQUE SE COMENTO PUES ES LA LOGICA A USAR COMPARAR LOS DOS STRING Y DAR PASO A LA EJECUCION DEL CODIGO           
            PERO TENGO UN ERROR Y NO ENTRA AL IF CUANDO ESTAN IGUALES, SE ISO UN IF DE NEGACION PARA 
            EL DESARROLLO DEL PROGRAMA PERO OBVIAMENTE ENTRA CUALQUIER RESPUESTA,
            if(respuestaUsuario.compareTo(preguntacorrecta)<0){   */

           

                

        if(rta=="correcto"){
                            
            
        boton7.setText("COMPROBAR");
        ArrayList<Integer> select=new ArrayList<Integer>();
        ArrayList<Integer> select2=new ArrayList<Integer>();
        Azar1.clear();
        select.add(3);
        select.add(4);
        select.add(5);
        select.add(6);
        int j,z;
        for (j=0; j<4; j++) {
            var aleatorio = Math.floor(Math.random()*(select.size()));
            int seleccionAzar = select.get((int)aleatorio);
            z = select.indexOf(seleccionAzar);
            select2.add((int)aleatorio);
            select.remove(z);

           /*  System.out.println("primer numero aleatorio:" + seleccionAzar);
            System.out.println("primer numero z:" + z);
            System.out.println("elementos de select :"+ select); */
            Azar1.add(seleccionAzar);

            // var aleatorio = Math.floor(Math.random()*(seleccion.length));
            // int seleccionAzar = seleccion[(int)aleatorio];
            // trace(seleccion);
          
            //System.out.println(aleatorio);
          
            // Sistem.out.println(seleccion);   
            
           
        }
     
        JLabel pregunta=new JLabel(answer[I][(P)]+" )   "+answer[I][2]);
        seleccion1=new JRadioButton("A )  "+answer[I][Azar1.get(0)]);
        
        seleccion2=new JRadioButton("B )  "+answer[I][Azar1.get(1)]);
        //String pregunta2=answer[i][5];
        seleccion3=new JRadioButton("C )  "+answer[I][Azar1.get(2)]);
        //String pregunta3=answer[i][6];
        seleccion4=new JRadioButton("D )  "+answer[I][Azar1.get(3)]);
        //String pregunta4=answer[i][7];
        
        
        preguntas=new ButtonGroup();
        
        preguntas.add(seleccion1);
        preguntas.add(seleccion2);
        preguntas.add(seleccion3);
        preguntas.add(seleccion4);
        Enunciado.add(pregunta);
        Enunciado.add(seleccion1);
        Enunciado.add(seleccion2);
        Enunciado.add(seleccion3);
        Enunciado.add(seleccion4);
        
        Panel.add(Enunciado);
        Panel.setViewportView(Enunciado);
        
        puntos.setText("PUNTOS :"+ I);
        
//CONDICIONAL PARA HABILITAR NIVELES
  if(I>5){
    boton2.setEnabled(true);
  }
  else if(I>10){
    boton3.setEnabled(true);
  }
  else if(I>15){
    boton4.setEnabled(true);
  }
  else if(I>21){
    boton3.setEnabled(true);
  }
 
  I=I+1;
  P=I-1;
        
    }
     
  else{
   
   JOptionPane.showMessageDialog(null,"Upps! Respuesta Equivocada.    Puntos acumulados "+ P, "OK", JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
    
  }
  
}
   

   
};

boton7.addActionListener(comprobar);

// EVENTO ACTIONLISTENER PARA SALIR 
ActionListener salir = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

        //CON ESTA LINEA DE CÓDIGO LLAMAMOS A LA FUNCIÓN Y CERRAMOS LA APLICACIÓN
      salir();
       
    }
};


boton6.addActionListener(salir);
}


	private void salir(){
        P=I-1;
        int valor = JOptionPane.showConfirmDialog(this,"Quieres salir de la aplicación?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        		if (valor == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Puntos acumulados "+ P, "SALIR", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            
        }
        
	}

    //FUNCIÓN PARA CREAR UN ARRAY DINÁMICO
    private ArrayList<Integer>rando(){

    
        ArrayList<Integer> select=new ArrayList<Integer>();
        Azar1.clear();
        select.add(3);
        select.add(4);
        select.add(5);
        select.add(6);
        int j,z;
        for (j=0; j<4; j++) {
            var aleatorio = Math.floor(Math.random()*(select.size()));
            int seleccionAzar = select.get((int)aleatorio);
            z = select.indexOf(seleccionAzar);
            select.remove(z);

            Azar1.add(seleccionAzar);

            System.out.println("longitud de Azar es: " + Azar1);
        }
        
        return(Azar1);
		
    }

//funcio evento de escoger respuesta
    /* private void comprobar(){
        seleccion1.setSelected(new View,OnClickListener()){
            @overrride
            private void onClick(view v){
                String enunciadoPregunta=seleccion1.getText().toString();
                System.out.println(enunciadoPregunta);
            }
        }

    } */

}

