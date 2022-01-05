
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;



public class Requerimiento1 extends JFrame {

    public Requerimiento1() throws SQLException{
        initUI();
            }
            public void initUI() throws SQLException{
                setLayout(new BorderLayout());
                String[] nombres = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
                JTable tabla1 = new JTable(mostrar(), nombres);
                JScrollPane Panel = new JScrollPane(tabla1);
                add(Panel, BorderLayout.CENTER);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400, 500);
                setLocationRelativeTo(null);
                setVisible(true);
        
    }
    

    
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();
        String matriz[][]= new String [lista.size()][7];
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getID_Pregunta());
            matriz[i][1] = String.valueOf(lista.get(i).getNivel());
            matriz[i][2] = lista.get(i).getEnunciado();
            matriz[i][3] = lista.get(i).getResc();
            matriz[i][4] = lista.get(i).getResi1();
            matriz[i][5] = lista.get(i).getResi2();
            matriz[i][6] = lista.get(i).getResi3();
        }
        return matriz;
    }
}



    

